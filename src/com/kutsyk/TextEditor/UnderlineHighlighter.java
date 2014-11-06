package com.kutsyk.TextEditor;

import javax.swing.text.*;
import java.awt.*;
/**
 *
 * @author Jianwei Leng Tuesday, June 8, 2010, 11:19 am MST
 */
public class UnderlineHighlighter extends DefaultHighlighter{

    // Shared painter used for default highlighting
    protected static final Highlighter.HighlightPainter sharedPainter
            = new UnderlineHighlightPainter(null);

    // Painter used for this highlighter
    protected Highlighter.HighlightPainter painter;

    // colors defined to draw wave line
    protected static final Color red = new Color(255, 19, 19);
    protected static final Color pink = new Color(255, 192, 192);
    protected static final Color white = Color.white;


    // c is the color of underline
    public UnderlineHighlighter(Color c) {
        painter = (c == null ? sharedPainter : new UnderlineHighlightPainter(c));
    }

    // Convenience method to add a highlight with
    // the default painter.
    public Object addHighlight(int p0, int p1) throws BadLocationException {
        return addHighlight(p0, p1, painter);
    }

    @Override
    public void setDrawsLayeredHighlights(boolean newValue) {
        // Illegal if false - we only support layered highlights
        if (newValue == false) {
        throw new IllegalArgumentException(
            "UnderlineHighlighter only draws layered highlights");
        }
        super.setDrawsLayeredHighlights(true);
    }
    

    /** Painter for underlined highlights.
     *
     */
    public static class UnderlineHighlightPainter extends
        LayeredHighlighter.LayerPainter {

        protected Color color; // The color for the underline

        // color to paint underline
        public UnderlineHighlightPainter(Color c) {
            color = c;
        }

        public void paint(Graphics g, int offs0, int offs1, Shape bounds,
            JTextComponent c) {
            // Do nothing: this method will never be called
        }

        public Shape paintLayer(Graphics g, int offs0, int offs1, Shape bounds,
            JTextComponent c, View view) {

            g.setColor(color == null ? c.getSelectionColor() : color);

            Rectangle alloc = null;
            if (offs0 == view.getStartOffset() && offs1 == view.getEndOffset()) {
                if (bounds instanceof Rectangle) {
                    alloc = (Rectangle) bounds;
                } else {
                    alloc = bounds.getBounds();
                }
            } else {
                try {
                    Shape shape = view.modelToView(offs0,
                    Position.Bias.Forward, offs1,
                    Position.Bias.Backward, bounds);
                    alloc = (shape instanceof Rectangle) ? (Rectangle) shape
                    : shape.getBounds();
                } catch (BadLocationException e) {
                    return null;
                }
            }

            FontMetrics fm = c.getFontMetrics(c.getFont());
            int baseline = alloc.y + alloc.height - fm.getDescent() + 1;
            for(int i=0; i<=2;i++){
                g.setColor( i == 0 ?  Color.white : color );
                g.drawLine(alloc.x, baseline+i, alloc.x + alloc.width, baseline+i);
            }
            baseline = alloc.y + alloc.height + 1;
            for(int i=0; i<=2;i++){
                g.setColor( i == 2 ?  Color.white : color );
                g.drawLine(alloc.x, alloc.y + i, alloc.x + alloc.width, alloc.y+i);
            }
            

            return alloc;
        }

        
        
      }

    /** Painter for wave underlined highlights.
     *
     */
    public static class WaveHighlightPainter extends
        LayeredHighlighter.LayerPainter {

        protected Color color; // The color for the underline

        // color to paint underline
        public WaveHighlightPainter() {
            //color = c;
        }

        public void paint(Graphics g, int offs0, int offs1, Shape bounds,
            JTextComponent c) {
            // Do nothing: this method will never be called
        }

        public Shape paintLayer(Graphics g, int offs0, int offs1, Shape bounds,
            JTextComponent c, View view) {

            g.setColor(color == null ? c.getSelectionColor() : color);

            Rectangle alloc = null;
            if (offs0 == view.getStartOffset() && offs1 == view.getEndOffset()) {
                if (bounds instanceof Rectangle) {
                    alloc = (Rectangle) bounds;
                } else {
                    alloc = bounds.getBounds();
                }
            } else {
                try {
                    Shape shape = view.modelToView(offs0,
                    Position.Bias.Forward, offs1,
                    Position.Bias.Backward, bounds);
                    alloc = (shape instanceof Rectangle) ? (Rectangle) shape
                    : shape.getBounds();
                } catch (BadLocationException e) {
                    return null;
                }
            }

            FontMetrics fm = c.getFontMetrics(c.getFont());

             int baseline = alloc.y + alloc.height - fm.getDescent() + 1;
            /*for(int i=0; i<=2;i++){
                g.setColor( i == 0 ?  Color.white : color );
                g.drawLine(alloc.x, baseline+i, alloc.x + alloc.width, baseline+i);
            }
            */
            baseline = alloc.y + alloc.height + 1;
            int basex = alloc.x, basey=alloc.y+alloc.height+1;

            // draw top white line
            g.setColor(white);
            g.drawLine(basex, basey, basex + alloc.width, basey);


            g.setColor(pink);
            g.drawLine(basex, basey+1, basex+alloc.width, basey+1);
            g.drawLine(basex, basey+2, basex+alloc.width, basey+2);

            g.setColor(red);
            
            for(int ii=0; ii<Math.floor(alloc.width/4); ii++) {
                g.drawLine(basex+ii*4, basey+1, basex+ii*4+1, basey+1);
            }
            for(int ii=0; ii<Math.floor(alloc.width/4); ii++) {
                g.drawLine(basex+ii*4+2, basey+2, basex+ii*4+3, basey+2);
            }

            g.setColor(white);
            //Create Point2D.Double
            g.drawLine(alloc.x, alloc.y+1, alloc.x, alloc.y+1);


            // draw ave line by integrating mixed red and pink short line

            // draw botton white line
            //for(int i=0; i<=2;i++){
            //    g.setColor( i == 2 ?  Color.white : color );
            //    g.drawLine(alloc.x, alloc.y + i, alloc.x + alloc.width, alloc.y+i);
            //}


            return alloc;
        }



      }
}