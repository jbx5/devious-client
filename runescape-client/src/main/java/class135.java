import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
public abstract class class135 extends Node {
   class135() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "-1428026624"
   )
   abstract void vmethod3254(Buffer var1);

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ler;B)V",
      garbageValue = "-110"
   )
   abstract void vmethod3248(ClanSettings var1);

   @ObfuscatedName("mc")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;",
      garbageValue = "52"
   )
   static String method2990(String var0, boolean var1) {
      String var2 = var1 ? "https://" : "http://";
      if (Client.gameBuild == 1) {
         var0 = var0 + "-wtrc";
      } else if (Client.gameBuild == 2) {
         var0 = var0 + "-wtqa";
      } else if (Client.gameBuild == 3) {
         var0 = var0 + "-wtwip";
      } else if (Client.gameBuild == 5) {
         var0 = var0 + "-wti";
      } else if (Client.gameBuild == 4) {
         var0 = "local";
      }

      String var3 = "";
      if (DynamicObject.field974 != null) {
         var3 = "/p=" + DynamicObject.field974;
      }

      String var4 = "runescape.com";
      return var2 + var0 + "." + var4 + "/l=" + class103.clientLanguage + "/a=" + Canvas.field126 + var3 + "/";
   }
}
