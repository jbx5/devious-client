import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
public class class237 {
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Lmv;"
   )
   @Export("musicTrack")
   public static MusicTrack musicTrack;
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Ldk;"
   )
   @Export("loginScreenRunesAnimation")
   static LoginScreenAnimation loginScreenRunesAnimation;
   @ObfuscatedName("nx")
   @ObfuscatedGetter(
      intValue = 1126118709
   )
   @Export("menuWidth")
   static int menuWidth;

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Component;B)V",
      garbageValue = "106"
   )
   static void method4769(Component var0) {
      var0.addMouseListener(MouseHandler.MouseHandler_instance);
      var0.addMouseMotionListener(MouseHandler.MouseHandler_instance);
      var0.addFocusListener(MouseHandler.MouseHandler_instance);
   }

   @ObfuscatedName("ik")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1851272414"
   )
   @Export("getWindowedMode")
   static int getWindowedMode() {
      return Client.isResizable ? 2 : 1;
   }
}
