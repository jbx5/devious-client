import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ml")
public class class346 {
   static {
      new HashMap();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lly;Lly;ZLnv;I)V",
      garbageValue = "-2018074733"
   )
   public static void method6684(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
      ItemComposition.ItemDefinition_archive = var0;
      class306.ItemDefinition_modelArchive = var1;
      Clock.ItemDefinition_inMembersWorld = var2;
      ItemComposition.ItemDefinition_fileCount = ItemComposition.ItemDefinition_archive.getGroupFileCount(10);
      class262.ItemDefinition_fontPlain11 = var3;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;I)Z",
      garbageValue = "-1098096483"
   )
   @Export("isNumber")
   public static boolean isNumber(CharSequence var0) {
      return class190.method3772(var0, 10, true);
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(Lqr;B)Ljava/lang/Object;",
      garbageValue = "6"
   )
   static Object method6683(class456 var0) {
      if (var0 == null) {
         throw new IllegalStateException("popValueOfType() failure - null baseVarType");
      } else {
         switch (var0.field4872) {
            case 0:
               return Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            case 1:
               return Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
            default:
               throw new IllegalStateException("popValueOfType() failure - unsupported type");
         }
      }
   }
}
