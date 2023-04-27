import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cm")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
   ApproximateRouteStrategy() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IIILif;I)Z",
      garbageValue = "286986723"
   )
   @Export("hasArrived")
   protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
      return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)Lgl;",
      garbageValue = "-1717461998"
   )
   @Export("getInvDefinition")
   public static InvDefinition getInvDefinition(int var0) {
      InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
         var1 = new InvDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         InvDefinition.InvDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZI)I",
      garbageValue = "16776960"
   )
   static int method1212(int var0, Script var1, boolean var2) {
      String var3;
      int var10;
      if (var0 == ScriptOpcodes.APPEND_NUM) {
         var3 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
         var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3 + var10;
         return 1;
      } else {
         String var4;
         if (var0 == ScriptOpcodes.APPEND) {
            SecureRandomCallable.Interpreter_stringStackSize -= 2;
            var3 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize];
            var4 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize + 1];
            Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3 + var4;
            return 1;
         } else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
            var3 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
            var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3 + KitDefinition.intToString(var10, true);
            return 1;
         } else if (var0 == ScriptOpcodes.LOWERCASE) {
            var3 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
            Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3.toLowerCase();
            return 1;
         } else {
            int var6;
            int var7;
            int var11;
            if (var0 == ScriptOpcodes.FROMDATE) {
               var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               long var14 = ((long)var11 + 11745L) * 86400000L;
               Interpreter.Interpreter_calendar.setTime(new Date(var14));
               var6 = Interpreter.Interpreter_calendar.get(5);
               var7 = Interpreter.Interpreter_calendar.get(2);
               int var8 = Interpreter.Interpreter_calendar.get(1);
               Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var7] + "-" + var8;
               return 1;
            } else if (var0 != ScriptOpcodes.TEXT_GENDER) {
               if (var0 == ScriptOpcodes.TOSTRING) {
                  var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = Integer.toString(var11);
                  return 1;
               } else if (var0 == ScriptOpcodes.COMPARE) {
                  SecureRandomCallable.Interpreter_stringStackSize -= 2;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = BuddyRankComparator.method2961(class16.compareStrings(Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize + 1], ClanSettings.clientLanguage));
                  return 1;
               } else {
                  int var9;
                  byte[] var12;
                  Font var13;
                  if (var0 == ScriptOpcodes.PARAHEIGHT) {
                     var3 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
                     Interpreter.Interpreter_intStackSize -= 2;
                     var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     var12 = class128.archive13.takeFile(var9, 0);
                     var13 = new Font(var12);
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10);
                     return 1;
                  } else if (var0 == ScriptOpcodes.PARAWIDTH) {
                     var3 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
                     Interpreter.Interpreter_intStackSize -= 2;
                     var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     var12 = class128.archive13.takeFile(var9, 0);
                     var13 = new Font(var12);
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10);
                     return 1;
                  } else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
                     SecureRandomCallable.Interpreter_stringStackSize -= 2;
                     var3 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize];
                     var4 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize + 1];
                     if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
                        Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3;
                     } else {
                        Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4;
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.ESCAPE) {
                     var3 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
                     Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
                     return 1;
                  } else if (var0 == ScriptOpcodes.APPEND_CHAR) {
                     var3 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
                     var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3 + (char)var10;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
                     var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = VarcInt.isCharPrintable((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
                     var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = MenuAction.isAlphaNumeric((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
                     var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class134.isCharAlphabetic((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
                     var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class149.isDigit((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.STRING_LENGTH) {
                     var3 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
                     if (var3 != null) {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.length();
                     } else {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.SUBSTRING) {
                     var3 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
                     Interpreter.Interpreter_intStackSize -= 2;
                     var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3.substring(var10, var9);
                     return 1;
                  } else if (var0 == ScriptOpcodes.REMOVETAGS) {
                     var3 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
                     StringBuilder var16 = new StringBuilder(var3.length());
                     boolean var17 = false;

                     for(var6 = 0; var6 < var3.length(); ++var6) {
                        var7 = var3.charAt(var6);
                        if (var7 == 60) {
                           var17 = true;
                        } else if (var7 == 62) {
                           var17 = false;
                        } else if (!var17) {
                           var16.append((char)var7);
                        }
                     }

                     Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var16.toString();
                     return 1;
                  } else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
                     var3 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
                     var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var10);
                     return 1;
                  } else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
                     SecureRandomCallable.Interpreter_stringStackSize -= 2;
                     var3 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize];
                     var4 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize + 1];
                     var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9);
                     return 1;
                  } else if (var0 == 4122) {
                     var3 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
                     Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3.toUpperCase();
                     return 1;
                  } else if (var0 == 4123) {
                     SecureRandomCallable.Interpreter_stringStackSize -= 3;
                     var3 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize];
                     var4 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize + 1];
                     String var5 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize + 2];
                     if (MusicPatchNode.localPlayer.appearance == null) {
                        Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var5;
                        return 1;
                     } else {
                        switch (MusicPatchNode.localPlayer.appearance.field3511) {
                           case 0:
                              Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3;
                              break;
                           case 1:
                              Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4;
                              break;
                           case 2:
                           default:
                              Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var5;
                        }

                        return 1;
                     }
                  } else {
                     return 2;
                  }
               }
            } else {
               SecureRandomCallable.Interpreter_stringStackSize -= 2;
               var3 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize];
               var4 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize + 1];
               if (MusicPatchNode.localPlayer.appearance != null && MusicPatchNode.localPlayer.appearance.gender != 0) {
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4;
               } else {
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3;
               }

               return 1;
            }
         }
      }
   }

   @ObfuscatedName("mc")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-458475537"
   )
   static final void method1205(int var0) {
      var0 = Math.max(Math.min(var0, 100), 0);
      var0 = 100 - var0;
      float var1 = 0.5F + (float)var0 / 200.0F;
      ScriptFrame.method1164((double)var1);
   }
}
