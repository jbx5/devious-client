import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
public final class class299 {
   @ObfuscatedName("av")
   static final HashMap field3356 = new HashMap();
   @ObfuscatedName("do")
   @ObfuscatedSignature(
      descriptor = "Ltj;"
   )
   @Export("worldSelectLeftSprite")
   static IndexedSprite worldSelectLeftSprite;

   static {
      TimeZone var0;
      synchronized(field3356) {
         TimeZone var2 = (TimeZone)field3356.get("Europe/London");
         if (var2 == null) {
            var2 = TimeZone.getTimeZone("Europe/London");
            field3356.put("Europe/London", var2);
         }

         var0 = var2;
      }

      java.util.Calendar.getInstance(var0);
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZB)I",
      garbageValue = "-69"
   )
   static int method5682(int var0, Script var1, boolean var2) {
      if (var0 == 6809) {
         int var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         ObjectComposition var4 = class175.getObjectDefinition(var3);
         Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : "";
         return 1;
      } else {
         return 2;
      }
   }
}
