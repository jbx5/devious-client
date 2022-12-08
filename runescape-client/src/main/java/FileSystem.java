import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
@Implements("FileSystem")
public class FileSystem {
   @ObfuscatedName("h")
   @Export("FileSystem_hasPermissions")
   static boolean FileSystem_hasPermissions = false;
   @ObfuscatedName("e")
   @Export("FileSystem_cacheDir")
   static File FileSystem_cacheDir;
   @ObfuscatedName("v")
   @Export("FileSystem_cacheFiles")
   static Hashtable FileSystem_cacheFiles = new Hashtable(16);
   @ObfuscatedName("ea")
   @ObfuscatedGetter(
      longValue = 5026500752660730289L
   )
   static long field1866;

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZI)I",
      garbageValue = "-996868680"
   )
   static int method3479(int var0, Script var1, boolean var2) {
      int var3;
      if (var0 == 3500) {
         var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.field747.method4106(var3) ? 1 : 0;
         return 1;
      } else if (var0 == 3501) {
         var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.field747.method4136(var3) ? 1 : 0;
         return 1;
      } else if (var0 == 3502) {
         var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.field747.method4104(var3) ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("lf")
   static final void method3480(double var0) {
      Rasterizer3D.Rasterizer3D_setBrightness(var0);
      ((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(var0);
      ItemComposition.ItemDefinition_cachedSprites.clear();
      StructComposition.clientPreferences.method2475(var0);
   }
}
