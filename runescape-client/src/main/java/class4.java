import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
public final class class4 {
   @ObfuscatedName("gq")
   @ObfuscatedGetter(
      intValue = -1182573109
   )
   static int field12;
   @ObfuscatedName("jf")
   @Export("regionLandArchives")
   static byte[][] regionLandArchives;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)[Lmi;",
      garbageValue = "-574756815"
   )
   static class330[] method17() {
      return new class330[]{class330.field3794, class330.field3795};
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lnm;Lnm;Lnm;Lnm;I)V",
      garbageValue = "220568265"
   )
   public static void method21(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, AbstractArchive var3) {
      int var4 = 0;
      if (var0 != null) {
         UserComparator3.Widget_archive = var0;
         DynamicObject.field985 = var1;
         ScriptEvent.Widget_spritesArchive = var2;
         class146.Widget_fontsArchive = var3;
         var4 = UserComparator3.Widget_archive.getGroupCount();
      }

      VerticalAlignment.Widget_interfaceComponents = new Widget[var4][];
      class264.Widget_loadedInterfaces = new boolean[var4];
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1773808953"
   )
   public static boolean method18() {
      return class297.musicPlayerStatus != 0 ? true : class475.midiPcmStream.isReady();
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-518646489"
   )
   public static void method19() {
      KitDefinition.KitDefinition_cached.clear();
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Lmq;I)I",
      garbageValue = "-935305362"
   )
   static int method22(Widget var0) {
      if (var0.type != 11) {
         Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
         return 1;
      } else {
         String var1 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
         Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var0.method6384(var1);
         return 1;
      }
   }
}
