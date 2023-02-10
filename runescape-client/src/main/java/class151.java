import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("et")
public class class151 extends class155 {
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1413057797
   )
   static int field1743;
   @ObfuscatedName("ec")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   @Export("archive11")
   static Archive archive11;
   @ObfuscatedName("f")
   String field1744;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1914806007
   )
   int field1748;
   @ObfuscatedName("v")
   byte field1745;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfn;"
   )
   final class156 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfn;)V"
   )
   class151(class156 var1) {
      this.this$0 = var1;
      this.field1744 = null;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lrd;B)V",
      garbageValue = "-123"
   )
   void vmethod3387(Buffer var1) {
      if (var1.readUnsignedByte() != 255) {
         --var1.offset;
         var1.readLong();
      }

      this.field1744 = var1.readStringCp1252NullTerminatedOrNull();
      this.field1748 = var1.readUnsignedShort();
      this.field1745 = var1.readByte();
      var1.readLong();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lfm;I)V",
      garbageValue = "127147356"
   )
   void vmethod3388(ClanChannel var1) {
      ClanChannelMember var2 = new ClanChannelMember();
      var2.username = new Username(this.field1744);
      var2.world = this.field1748;
      var2.rank = this.field1745;
      var1.addMember(var2);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZI)I",
      garbageValue = "-1068248433"
   )
   static int method3302(int var0, Script var1, boolean var2) {
      int var3;
      int var6;
      int var9;
      if (var0 == ScriptOpcodes.ENUM_STRING) {
         class302.Interpreter_intStackSize -= 2;
         var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
         var9 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
         EnumComposition var10 = UserComparator10.getEnum(var3);
         if (var10.outputType != 's') {
         }

         for(var6 = 0; var6 < var10.outputCount; ++var6) {
            if (var9 == var10.keys[var6]) {
               Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var10.strVals[var6];
               var10 = null;
               break;
            }
         }

         if (var10 != null) {
            Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var10.defaultStr;
         }

         return 1;
      } else if (var0 != ScriptOpcodes.ENUM) {
         if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) {
            var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            EnumComposition var4 = UserComparator10.getEnum(var3);
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.size();
            return 1;
         } else {
            return 2;
         }
      } else {
         class302.Interpreter_intStackSize -= 4;
         var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
         var9 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
         int var5 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2];
         var6 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 3];
         EnumComposition var7 = UserComparator10.getEnum(var5);
         if (var3 == var7.inputType && var9 == var7.outputType) {
            for(int var8 = 0; var8 < var7.outputCount; ++var8) {
               if (var6 == var7.keys[var8]) {
                  if (var9 == 115) {
                     Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var7.strVals[var8];
                  } else {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7.intVals[var8];
                  }

                  var7 = null;
                  break;
               }
            }

            if (var7 != null) {
               if (var9 == 115) {
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var7.defaultStr;
               } else {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7.defaultInt;
               }
            }

            return 1;
         } else {
            if (var9 == 115) {
               Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "null";
            } else {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         }
      }
   }
}
