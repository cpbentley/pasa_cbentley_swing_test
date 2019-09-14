package pasa.cbentley.swing.utils.tests;

import pasa.cbentley.swing.ctx.SwingCtx;
import pasa.cbentley.swing.utils.SwingColorStore;
import pasa.cbentley.testing.BentleyTestCase;

public class TestSwingColorStore extends BentleyTestCase {

   SwingColorStore colorStore;
   
   protected SwingCtx sc;
   
   public void setupAbstract() {
      sc = new SwingCtx(uc);
      colorStore = new SwingColorStore(sc);
   }

}
