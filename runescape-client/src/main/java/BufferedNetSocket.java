import java.io.IOException;
import java.net.Socket;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("qw")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lgs;"
   )
   @Export("clock")
   static Clock clock;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 1413095443
   )
   static int field4622;
   @ObfuscatedName("at")
   @Export("socket")
   Socket socket;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lqa;"
   )
   @Export("source")
   BufferedSource source;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lqn;"
   )
   @Export("sink")
   BufferedSink sink;

   BufferedNetSocket(Socket var1, int var2, int var3) throws IOException {
      this.socket = var1;
      this.socket.setSoTimeout(30000);
      this.socket.setTcpNoDelay(true);
      this.socket.setReceiveBufferSize(65536);
      this.socket.setSendBufferSize(65536);
      this.source = new BufferedSource(this.socket.getInputStream(), var2);
      this.sink = new BufferedSink(this.socket.getOutputStream(), var3);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1623804098"
   )
   @Export("isAvailable")
   public boolean isAvailable(int var1) throws IOException {
      return this.source.isAvailable(var1);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   @Export("available")
   public int available() throws IOException {
      return this.source.available();
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "82"
   )
   @Export("readUnsignedByte")
   public int readUnsignedByte() throws IOException {
      return this.source.readUnsignedByte();
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "([BIIB)I",
      garbageValue = "-22"
   )
   @Export("read")
   public int read(byte[] var1, int var2, int var3) throws IOException {
      return this.source.read(var1, var2, var3);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "([BIII)V",
      garbageValue = "-1586948718"
   )
   @Export("write")
   public void write(byte[] var1, int var2, int var3) throws IOException {
      this.sink.write(var1, var2, var3);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-22185"
   )
   @Export("close")
   public void close() {
      this.sink.close();

      try {
         this.socket.close();
      } catch (IOException var2) {
      }

      this.source.close();
   }

   protected void finalize() {
      this.close();
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZI)I",
      garbageValue = "-667099299"
   )
   static int method7977(int var0, Script var1, boolean var2) {
      String var3;
      int var10;
      if (var0 == ScriptOpcodes.APPEND_NUM) {
         var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
         var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3 + var10;
         return 1;
      } else {
         String var4;
         if (var0 == ScriptOpcodes.APPEND) {
            class149.Interpreter_stringStackSize -= 2;
            var3 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize];
            var4 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize + 1];
            Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3 + var4;
            return 1;
         } else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
            var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
            var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3 + ChatChannel.intToString(var10, true);
            return 1;
         } else if (var0 == ScriptOpcodes.LOWERCASE) {
            var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
            Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3.toLowerCase();
            return 1;
         } else {
            int var6;
            int var7;
            int var11;
            if (var0 == ScriptOpcodes.FROMDATE) {
               var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               long var14 = (11745L + (long)var11) * 86400000L;
               Interpreter.Interpreter_calendar.setTime(new Date(var14));
               var6 = Interpreter.Interpreter_calendar.get(5);
               var7 = Interpreter.Interpreter_calendar.get(2);
               int var8 = Interpreter.Interpreter_calendar.get(1);
               Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var7] + "-" + var8;
               return 1;
            } else if (var0 != ScriptOpcodes.TEXT_GENDER) {
               if (var0 == ScriptOpcodes.TOSTRING) {
                  var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = Integer.toString(var11);
                  return 1;
               } else if (var0 == ScriptOpcodes.COMPARE) {
                  class149.Interpreter_stringStackSize -= 2;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class157.method3299(class196.compareStrings(Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize + 1], TriBool.clientLanguage));
                  return 1;
               } else {
                  int var9;
                  byte[] var12;
                  Font var13;
                  if (var0 == ScriptOpcodes.PARAHEIGHT) {
                     var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
                     Interpreter.Interpreter_intStackSize -= 2;
                     var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     var12 = class310.archive13.takeFile(var9, 0);
                     var13 = new Font(var12);
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10);
                     return 1;
                  } else if (var0 == ScriptOpcodes.PARAWIDTH) {
                     var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
                     Interpreter.Interpreter_intStackSize -= 2;
                     var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     var12 = class310.archive13.takeFile(var9, 0);
                     var13 = new Font(var12);
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10);
                     return 1;
                  } else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
                     class149.Interpreter_stringStackSize -= 2;
                     var3 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize];
                     var4 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize + 1];
                     if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
                        Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3;
                     } else {
                        Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var4;
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.ESCAPE) {
                     var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
                     Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
                     return 1;
                  } else if (var0 == ScriptOpcodes.APPEND_CHAR) {
                     var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
                     var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3 + (char)var10;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
                     var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class323.isCharPrintable((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
                     var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class209.isAlphaNumeric((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
                     var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class382.isCharAlphabetic((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
                     var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class159.isDigit((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.STRING_LENGTH) {
                     var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
                     if (var3 != null) {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.length();
                     } else {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.SUBSTRING) {
                     var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
                     Interpreter.Interpreter_intStackSize -= 2;
                     var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3.substring(var10, var9);
                     return 1;
                  } else if (var0 == ScriptOpcodes.REMOVETAGS) {
                     var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
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

                     Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var16.toString();
                     return 1;
                  } else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
                     var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
                     var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var10);
                     return 1;
                  } else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
                     class149.Interpreter_stringStackSize -= 2;
                     var3 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize];
                     var4 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize + 1];
                     var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9);
                     return 1;
                  } else if (var0 == 4122) {
                     var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
                     Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3.toUpperCase();
                     return 1;
                  } else if (var0 == 4123) {
                     class149.Interpreter_stringStackSize -= 3;
                     var3 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize];
                     var4 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize + 1];
                     String var5 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize + 2];
                     if (Projectile.localPlayer.appearance == null) {
                        Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var5;
                        return 1;
                     } else {
                        switch (Projectile.localPlayer.appearance.field3541) {
                           case 0:
                              Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3;
                              break;
                           case 1:
                              Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var4;
                              break;
                           case 2:
                           default:
                              Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var5;
                        }

                        return 1;
                     }
                  } else {
                     return 2;
                  }
               }
            } else {
               class149.Interpreter_stringStackSize -= 2;
               var3 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize];
               var4 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize + 1];
               if (Projectile.localPlayer.appearance != null && Projectile.localPlayer.appearance.gender != 0) {
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var4;
               } else {
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3;
               }

               return 1;
            }
         }
      }
   }
}
