import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cm")
public class class96 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1762551422"
   )
   public static boolean method2680() {
      long var0 = class153.method3317();
      int var2 = (int)(var0 - NetCache.field4252);
      NetCache.field4252 = var0;
      if (var2 > 200) {
         var2 = 200;
      }

      NetCache.NetCache_loadTime += var2;
      if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) {
         return true;
      } else if (NetCache.NetCache_socket == null) {
         return false;
      } else {
         try {
            if (NetCache.NetCache_loadTime > 30000) {
               throw new IOException();
            } else {
               NetFileRequest var3;
               Buffer var4;
               while(NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) {
                  var3 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first();
                  var4 = new Buffer(4);
                  var4.writeByte(1);
                  var4.writeMedium((int)var3.key);
                  NetCache.NetCache_socket.write(var4.array, 0, 4);
                  NetCache.NetCache_pendingPriorityResponses.put(var3, var3.key);
                  --NetCache.NetCache_pendingPriorityWritesCount;
                  ++NetCache.NetCache_pendingPriorityResponsesCount;
               }

               while(NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) {
                  var3 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast();
                  var4 = new Buffer(4);
                  var4.writeByte(0);
                  var4.writeMedium((int)var3.key);
                  NetCache.NetCache_socket.write(var4.array, 0, 4);
                  var3.removeDual();
                  NetCache.NetCache_pendingResponses.put(var3, var3.key);
                  --NetCache.NetCache_pendingWritesCount;
                  ++NetCache.NetCache_pendingResponsesCount;
               }

               for(int var15 = 0; var15 < 100; ++var15) {
                  int var16 = NetCache.NetCache_socket.available();
                  if (var16 < 0) {
                     throw new IOException();
                  }

                  if (var16 == 0) {
                     break;
                  }

                  NetCache.NetCache_loadTime = 0;
                  byte var5 = 0;
                  if (WorldMapDecoration.NetCache_currentResponse == null) {
                     var5 = 8;
                  } else if (NetCache.field4250 == 0) {
                     var5 = 1;
                  }

                  int var6;
                  int var7;
                  int var8;
                  byte[] var10000;
                  int var10001;
                  Buffer var21;
                  if (var5 > 0) {
                     var6 = var5 - NetCache.NetCache_responseHeaderBuffer.offset;
                     if (var6 > var16) {
                        var6 = var16;
                     }

                     NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var6);
                     if (NetCache.field4248 != 0) {
                        for(var7 = 0; var7 < var6; ++var7) {
                           var10000 = NetCache.NetCache_responseHeaderBuffer.array;
                           var10001 = NetCache.NetCache_responseHeaderBuffer.offset + var7;
                           var10000[var10001] ^= NetCache.field4248;
                        }
                     }

                     var21 = NetCache.NetCache_responseHeaderBuffer;
                     var21.offset += var6;
                     if (NetCache.NetCache_responseHeaderBuffer.offset < var5) {
                        break;
                     }

                     if (WorldMapDecoration.NetCache_currentResponse == null) {
                        NetCache.NetCache_responseHeaderBuffer.offset = 0;
                        var7 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
                        var8 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort();
                        int var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
                        int var10 = NetCache.NetCache_responseHeaderBuffer.readInt();
                        long var11 = (long)(var8 + (var7 << 16));
                        NetFileRequest var13 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var11);
                        Messages.field1381 = true;
                        if (var13 == null) {
                           var13 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var11);
                           Messages.field1381 = false;
                        }

                        if (var13 == null) {
                           throw new IOException();
                        }

                        int var14 = var9 == 0 ? 5 : 9;
                        WorldMapDecoration.NetCache_currentResponse = var13;
                        class14.NetCache_responseArchiveBuffer = new Buffer(var14 + var10 + WorldMapDecoration.NetCache_currentResponse.padding);
                        class14.NetCache_responseArchiveBuffer.writeByte(var9);
                        class14.NetCache_responseArchiveBuffer.writeInt(var10);
                        NetCache.field4250 = 8;
                        NetCache.NetCache_responseHeaderBuffer.offset = 0;
                     } else if (NetCache.field4250 == 0) {
                        if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) {
                           NetCache.field4250 = 1;
                           NetCache.NetCache_responseHeaderBuffer.offset = 0;
                        } else {
                           WorldMapDecoration.NetCache_currentResponse = null;
                        }
                     }
                  } else {
                     var6 = class14.NetCache_responseArchiveBuffer.array.length - WorldMapDecoration.NetCache_currentResponse.padding;
                     var7 = 512 - NetCache.field4250;
                     if (var7 > var6 - class14.NetCache_responseArchiveBuffer.offset) {
                        var7 = var6 - class14.NetCache_responseArchiveBuffer.offset;
                     }

                     if (var7 > var16) {
                        var7 = var16;
                     }

                     NetCache.NetCache_socket.read(class14.NetCache_responseArchiveBuffer.array, class14.NetCache_responseArchiveBuffer.offset, var7);
                     if (NetCache.field4248 != 0) {
                        for(var8 = 0; var8 < var7; ++var8) {
                           var10000 = class14.NetCache_responseArchiveBuffer.array;
                           var10001 = var8 + class14.NetCache_responseArchiveBuffer.offset;
                           var10000[var10001] ^= NetCache.field4248;
                        }
                     }

                     var21 = class14.NetCache_responseArchiveBuffer;
                     var21.offset += var7;
                     NetCache.field4250 += var7;
                     if (var6 == class14.NetCache_responseArchiveBuffer.offset) {
                        if (16711935L == WorldMapDecoration.NetCache_currentResponse.key) {
                           class10.field56 = class14.NetCache_responseArchiveBuffer;

                           for(var8 = 0; var8 < 256; ++var8) {
                              Archive var17 = NetCache.NetCache_archives[var8];
                              if (var17 != null) {
                                 class1.method9(var17, var8);
                              }
                           }
                        } else {
                           NetCache.NetCache_crc.reset();
                           NetCache.NetCache_crc.update(class14.NetCache_responseArchiveBuffer.array, 0, var6);
                           var8 = (int)NetCache.NetCache_crc.getValue();
                           if (var8 != WorldMapDecoration.NetCache_currentResponse.crc) {
                              try {
                                 NetCache.NetCache_socket.close();
                              } catch (Exception var19) {
                              }

                              ++NetCache.NetCache_crcMismatches;
                              NetCache.NetCache_socket = null;
                              NetCache.field4248 = (byte)((int)(Math.random() * 255.0 + 1.0));
                              return false;
                           }

                           NetCache.NetCache_crcMismatches = 0;
                           NetCache.NetCache_ioExceptions = 0;
                           WorldMapDecoration.NetCache_currentResponse.archive.write((int)(WorldMapDecoration.NetCache_currentResponse.key & 65535L), class14.NetCache_responseArchiveBuffer.array, 16711680L == (WorldMapDecoration.NetCache_currentResponse.key & 16711680L), Messages.field1381);
                        }

                        WorldMapDecoration.NetCache_currentResponse.remove();
                        if (Messages.field1381) {
                           --NetCache.NetCache_pendingPriorityResponsesCount;
                        } else {
                           --NetCache.NetCache_pendingResponsesCount;
                        }

                        NetCache.field4250 = 0;
                        WorldMapDecoration.NetCache_currentResponse = null;
                        class14.NetCache_responseArchiveBuffer = null;
                     } else {
                        if (NetCache.field4250 != 512) {
                           break;
                        }

                        NetCache.field4250 = 0;
                     }
                  }
               }

               return true;
            }
         } catch (IOException var20) {
            try {
               NetCache.NetCache_socket.close();
            } catch (Exception var18) {
            }

            ++NetCache.NetCache_ioExceptions;
            NetCache.NetCache_socket = null;
            return false;
         }
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;Lmn;IB)Lji;",
      garbageValue = "-1"
   )
   public static PacketBufferNode method2686(int var0, String var1, Language var2, int var3) {
      PacketBufferNode var4 = Renderable.getPacketBufferNode(ClientPacket.field3128, Client.packetWriter.isaacCipher);
      var4.packetBuffer.writeByte(0);
      int var5 = var4.packetBuffer.offset;
      var4.packetBuffer.writeByte(var0);
      String var6 = var1.toLowerCase();
      byte var7 = 0;
      if (var6.startsWith("yellow:")) {
         var7 = 0;
         var1 = var1.substring("yellow:".length());
      } else if (var6.startsWith("red:")) {
         var7 = 1;
         var1 = var1.substring("red:".length());
      } else if (var6.startsWith("green:")) {
         var7 = 2;
         var1 = var1.substring("green:".length());
      } else if (var6.startsWith("cyan:")) {
         var7 = 3;
         var1 = var1.substring("cyan:".length());
      } else if (var6.startsWith("purple:")) {
         var7 = 4;
         var1 = var1.substring("purple:".length());
      } else if (var6.startsWith("white:")) {
         var7 = 5;
         var1 = var1.substring("white:".length());
      } else if (var6.startsWith("flash1:")) {
         var7 = 6;
         var1 = var1.substring("flash1:".length());
      } else if (var6.startsWith("flash2:")) {
         var7 = 7;
         var1 = var1.substring("flash2:".length());
      } else if (var6.startsWith("flash3:")) {
         var7 = 8;
         var1 = var1.substring("flash3:".length());
      } else if (var6.startsWith("glow1:")) {
         var7 = 9;
         var1 = var1.substring("glow1:".length());
      } else if (var6.startsWith("glow2:")) {
         var7 = 10;
         var1 = var1.substring("glow2:".length());
      } else if (var6.startsWith("glow3:")) {
         var7 = 11;
         var1 = var1.substring("glow3:".length());
      } else if (var2 != Language.Language_EN) {
         if (var6.startsWith("yellow:")) {
            var7 = 0;
            var1 = var1.substring("yellow:".length());
         } else if (var6.startsWith("red:")) {
            var7 = 1;
            var1 = var1.substring("red:".length());
         } else if (var6.startsWith("green:")) {
            var7 = 2;
            var1 = var1.substring("green:".length());
         } else if (var6.startsWith("cyan:")) {
            var7 = 3;
            var1 = var1.substring("cyan:".length());
         } else if (var6.startsWith("purple:")) {
            var7 = 4;
            var1 = var1.substring("purple:".length());
         } else if (var6.startsWith("white:")) {
            var7 = 5;
            var1 = var1.substring("white:".length());
         } else if (var6.startsWith("flash1:")) {
            var7 = 6;
            var1 = var1.substring("flash1:".length());
         } else if (var6.startsWith("flash2:")) {
            var7 = 7;
            var1 = var1.substring("flash2:".length());
         } else if (var6.startsWith("flash3:")) {
            var7 = 8;
            var1 = var1.substring("flash3:".length());
         } else if (var6.startsWith("glow1:")) {
            var7 = 9;
            var1 = var1.substring("glow1:".length());
         } else if (var6.startsWith("glow2:")) {
            var7 = 10;
            var1 = var1.substring("glow2:".length());
         } else if (var6.startsWith("glow3:")) {
            var7 = 11;
            var1 = var1.substring("glow3:".length());
         }
      }

      var6 = var1.toLowerCase();
      byte var8 = 0;
      if (var6.startsWith("wave:")) {
         var8 = 1;
         var1 = var1.substring("wave:".length());
      } else if (var6.startsWith("wave2:")) {
         var8 = 2;
         var1 = var1.substring("wave2:".length());
      } else if (var6.startsWith("shake:")) {
         var8 = 3;
         var1 = var1.substring("shake:".length());
      } else if (var6.startsWith("scroll:")) {
         var8 = 4;
         var1 = var1.substring("scroll:".length());
      } else if (var6.startsWith("slide:")) {
         var8 = 5;
         var1 = var1.substring("slide:".length());
      } else if (var2 != Language.Language_EN) {
         if (var6.startsWith("wave:")) {
            var8 = 1;
            var1 = var1.substring("wave:".length());
         } else if (var6.startsWith("wave2:")) {
            var8 = 2;
            var1 = var1.substring("wave2:".length());
         } else if (var6.startsWith("shake:")) {
            var8 = 3;
            var1 = var1.substring("shake:".length());
         } else if (var6.startsWith("scroll:")) {
            var8 = 4;
            var1 = var1.substring("scroll:".length());
         } else if (var6.startsWith("slide:")) {
            var8 = 5;
            var1 = var1.substring("slide:".length());
         }
      }

      var4.packetBuffer.writeByte(var7);
      var4.packetBuffer.writeByte(var8);
      ServerPacket.method5563(var4.packetBuffer, var1);
      if (var0 == class317.field3738.rsOrdinal()) {
         var4.packetBuffer.writeByte(var3);
      }

      var4.packetBuffer.writeLengthByte(var4.packetBuffer.offset - var5);
      return var4;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZB)I",
      garbageValue = "9"
   )
   static int method2687(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? Interpreter.scriptDotWidget : class85.scriptActiveWidget;
      if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.itemId;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
         if (var3.itemId != -1) {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.itemQuantity;
         } else {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETID) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.childIndex;
         return 1;
      } else if (var0 == 1707) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.method6351() ? 1 : 0;
         return 1;
      } else if (var0 == 1708) {
         return FileSystem.method3510(var3);
      } else {
         return var0 == 1709 ? class308.method6188(var3) : 2;
      }
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)I",
      garbageValue = "2"
   )
   @Export("stringCp1252NullTerminatedByteSize")
   public static int stringCp1252NullTerminatedByteSize(String var0) {
      return var0.length() + 1;
   }
}
