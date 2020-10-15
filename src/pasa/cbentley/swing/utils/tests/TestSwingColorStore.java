package pasa.cbentley.swing.utils.tests;

import pasa.cbentley.core.src5.ctx.C5Ctx;
import pasa.cbentley.swing.ctx.SwingCtx;
import pasa.cbentley.swing.utils.SwingColorStore;
import pasa.cbentley.testing.engine.TestCaseBentley;

public class TestSwingColorStore extends TestCaseBentley {

   SwingColorStore colorStore;
   
   protected SwingCtx sc;
   
   public void setupAbstract() {
      C5Ctx c5 = new C5Ctx(uc);
      sc = new SwingCtx(c5);
      colorStore = new SwingColorStore(sc);
   }

}
