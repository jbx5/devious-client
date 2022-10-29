import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("ScriptFrame")
public class ScriptFrame {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lbz;"
   )
   @Export("script")
   Script script;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -205779865
   )
   @Export("pc")
   int pc = -1;
   @ObfuscatedName("c")
   @Export("intLocals")
   int[] intLocals;
   @ObfuscatedName("x")
   @Export("stringLocals")
   String[] stringLocals;

   ScriptFrame() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Llg;Llg;I)V",
      garbageValue = "2050879682"
   )
   public static void method1134(AbstractArchive var0, AbstractArchive var1) {
      HealthBarDefinition.HealthBarDefinition_archive = var0;
      HealthBarDefinition.field1913 = var1;
   }

   @ObfuscatedName("f")
   static boolean method1135(long var0) {
      int var2 = (int)(var0 >>> 14 & 3L);
      return var2 == 2;
   }
}
