import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("in")
@Implements("Rasterizer3D")
public class Rasterizer3D {
   @ObfuscatedName("af")
   @Export("Rasterizer3D_colorPalette")
   public static int[] Rasterizer3D_colorPalette = new int[65536];
   @ObfuscatedName("an")
   static int[] field2517 = new int[512];
   @ObfuscatedName("aw")
   static int[] field2513 = new int[2048];
   @ObfuscatedName("ac")
   @Export("Rasterizer3D_sine")
   public static int[] Rasterizer3D_sine = new int[2048];
   @ObfuscatedName("au")
   @Export("Rasterizer3D_cosine")
   public static int[] Rasterizer3D_cosine = new int[2048];
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static class236 field2514;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lii;"
   )
   static class220 field2519;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lii;"
   )
   static final class220 field2518;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lii;"
   )
   static final class220 field2512;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -689745739
   )
   static int field2520;

   static {
      int var0;
      for(var0 = 1; var0 < 512; ++var0) {
         field2517[var0] = '耀' / var0;
      }

      for(var0 = 1; var0 < 2048; ++var0) {
         field2513[var0] = 65536 / var0;
      }

      for(var0 = 0; var0 < 2048; ++var0) {
         Rasterizer3D_sine[var0] = (int)(65536.0 * Math.sin(0.0030679615 * (double)var0));
         Rasterizer3D_cosine[var0] = (int)(65536.0 * Math.cos(0.0030679615 * (double)var0));
      }

      field2514 = new class236();
      field2518 = new class235(field2514);
      field2512 = new class237(field2514);
      field2519 = field2518;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;ZB)Lsy;",
      garbageValue = "-55"
   )
   @Export("getPreferencesFile")
   public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
      File var3 = new File(class335.cacheDir, "preferences" + var0 + ".dat");
      if (var3.exists()) {
         try {
            AccessFile var10 = new AccessFile(var3, "rw", 10000L);
            return var10;
         } catch (IOException var9) {
         }
      }

      String var4 = "";
      if (JagexCache.cacheGamebuild == 33) {
         var4 = "_rc";
      } else if (JagexCache.cacheGamebuild == 34) {
         var4 = "_wip";
      }

      File var5 = new File(HorizontalAlignment.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
      AccessFile var6;
      if (!var2 && var5.exists()) {
         try {
            var6 = new AccessFile(var5, "rw", 10000L);
            return var6;
         } catch (IOException var8) {
         }
      }

      try {
         var6 = new AccessFile(var3, "rw", 10000L);
         return var6;
      } catch (IOException var7) {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZI)I",
      garbageValue = "734419623"
   )
   static int method4451(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget;
      if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class195.Widget_unpackTargetMask(KeyHandler.getWidgetFlags(var3));
         return 1;
      } else if (var0 != ScriptOpcodes.CC_GETOP) {
         if (var0 == ScriptOpcodes.CC_GETOPBASE) {
            if (var3.dataText == null) {
               Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
            } else {
               Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3.dataText;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         --var4;
         if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
            Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3.actions[var4];
         } else {
            Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
         }

         return 1;
      }
   }
}
