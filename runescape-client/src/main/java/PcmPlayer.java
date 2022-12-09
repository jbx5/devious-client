import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
@Implements("PcmPlayer")
public class PcmPlayer {
   @ObfuscatedName("vd")
   static List field333;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 519516550
   )
   public static int field325;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Law;"
   )
   @Export("soundSystem")
   static SoundSystem soundSystem;
   @ObfuscatedName("j")
   @Export("Tiles_saturation")
   static int[] Tiles_saturation;
   @ObfuscatedName("o")
   @Export("samples")
   protected int[] samples;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Laa;"
   )
   @Export("stream")
   PcmStream stream;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1650041923
   )
   int field317 = 32;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      longValue = 244756660672843037L
   )
   @Export("timeMs")
   long timeMs = Message.method1197();
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -492551753
   )
   @Export("capacity")
   int capacity;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -354348965
   )
   int field320;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -1338328461
   )
   int field312;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      longValue = -341542258888666809L
   )
   long field322 = 0L;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 742475801
   )
   int field323 = 0;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1012487413
   )
   int field324 = 0;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1158064801
   )
   int field329 = 0;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      longValue = 8623637060416294591L
   )
   long field318 = 0L;
   @ObfuscatedName("w")
   boolean field327 = true;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 2049685311
   )
   int field328 = 0;
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "[Laa;"
   )
   PcmStream[] field321 = new PcmStream[8];
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "[Laa;"
   )
   PcmStream[] field330 = new PcmStream[8];

   protected PcmPlayer() {
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1022018312"
   )
   @Export("init")
   protected void init() throws Exception {
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-95"
   )
   @Export("open")
   protected void open(int var1) throws Exception {
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "116"
   )
   @Export("position")
   protected int position() throws Exception {
      return this.capacity;
   }

   @ObfuscatedName("x")
   @Export("write")
   protected void write() throws Exception {
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-126"
   )
   @Export("close")
   protected void close() {
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1458227244"
   )
   @Export("discard")
   protected void discard() throws Exception {
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(Laa;I)V",
      garbageValue = "-2127499053"
   )
   @Export("setStream")
   public final synchronized void setStream(PcmStream var1) {
      this.stream = var1;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-431761037"
   )
   @Export("run")
   public final synchronized void run() {
      if (this.samples != null) {
         long var1 = Message.method1197();

         try {
            if (0L != this.field322) {
               if (var1 < this.field322) {
                  return;
               }

               this.open(this.capacity);
               this.field322 = 0L;
               this.field327 = true;
            }

            int var3 = this.position();
            if (this.field329 - var3 > this.field323) {
               this.field323 = this.field329 - var3;
            }

            int var4 = this.field312 + this.field320;
            if (var4 + 256 > 16384) {
               var4 = 16128;
            }

            if (var4 + 256 > this.capacity) {
               this.capacity += 1024;
               if (this.capacity > 16384) {
                  this.capacity = 16384;
               }

               this.close();
               this.open(this.capacity);
               var3 = 0;
               this.field327 = true;
               if (var4 + 256 > this.capacity) {
                  var4 = this.capacity - 256;
                  this.field312 = var4 - this.field320;
               }
            }

            while(var3 < var4) {
               this.fill(this.samples, 256);
               this.write();
               var3 += 256;
            }

            if (var1 > this.field318) {
               if (!this.field327) {
                  if (this.field323 == 0 && this.field324 == 0) {
                     this.close();
                     this.field322 = 2000L + var1;
                     return;
                  }

                  this.field312 = Math.min(this.field324, this.field323);
                  this.field324 = this.field323;
               } else {
                  this.field327 = false;
               }

               this.field323 = 0;
               this.field318 = 2000L + var1;
            }

            this.field329 = var3;
         } catch (Exception var7) {
            this.close();
            this.field322 = var1 + 2000L;
         }

         try {
            if (var1 > 500000L + this.timeMs) {
               var1 = this.timeMs;
            }

            while(var1 > 5000L + this.timeMs) {
               this.skip(256);
               this.timeMs += (long)(256000 / (field325 * 22050));
            }
         } catch (Exception var6) {
            this.timeMs = var1;
         }

      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2068894886"
   )
   public final void method817() {
      this.field327 = true;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-54"
   )
   @Export("tryDiscard")
   public final synchronized void tryDiscard() {
      this.field327 = true;

      try {
         this.discard();
      } catch (Exception var2) {
         this.close();
         this.field322 = Message.method1197() + 2000L;
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1880345802"
   )
   @Export("shutdown")
   public final synchronized void shutdown() {
      if (soundSystem != null) {
         boolean var1 = true;

         for(int var2 = 0; var2 < 2; ++var2) {
            if (this == soundSystem.players[var2]) {
               soundSystem.players[var2] = null;
            }

            if (soundSystem.players[var2] != null) {
               var1 = false;
            }
         }

         if (var1) {
            class11.soundSystemExecutor.shutdownNow();
            class11.soundSystemExecutor = null;
            soundSystem = null;
         }
      }

      this.close();
      this.samples = null;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "434161889"
   )
   @Export("skip")
   final void skip(int var1) {
      this.field328 -= var1;
      if (this.field328 < 0) {
         this.field328 = 0;
      }

      if (this.stream != null) {
         this.stream.skip(var1);
      }

   }

   @ObfuscatedName("an")
   @Export("fill")
   final void fill(int[] var1, int var2) {
      int var3 = var2;
      if (class286.PcmPlayer_stereo) {
         var3 = var2 << 1;
      }

      class373.clearIntArray(var1, 0, var3);
      this.field328 -= var2;
      if (this.stream != null && this.field328 <= 0) {
         this.field328 += field325 * 22050 >> 4;
         GrandExchangeEvents.PcmStream_disable(this.stream);
         this.method801(this.stream, this.stream.vmethod1052());
         int var4 = 0;
         int var5 = 255;

         int var6;
         PcmStream var10;
         label107:
         for(var6 = 7; var5 != 0; --var6) {
            int var7;
            int var8;
            if (var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if ((var9 & 1) != 0) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  PcmStream var11 = this.field321[var7];

                  label101:
                  while(true) {
                     while(true) {
                        if (var11 == null) {
                           break label101;
                        }

                        AbstractSound var12 = var11.sound;
                        if (var12 != null && var12.position > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.after;
                        } else {
                           var11.active = true;
                           int var13 = var11.vmethod5753();
                           var4 += var13;
                           if (var12 != null) {
                              var12.position += var13;
                           }

                           if (var4 >= this.field317) {
                              break label107;
                           }

                           PcmStream var14 = var11.firstSubStream();
                           if (var14 != null) {
                              for(int var15 = var11.field383; var14 != null; var14 = var11.nextSubStream()) {
                                 this.method801(var14, var15 * var14.vmethod1052() >> 8);
                              }
                           }

                           PcmStream var18 = var11.after;
                           var11.after = null;
                           if (var10 == null) {
                              this.field321[var7] = var18;
                           } else {
                              var10.after = var18;
                           }

                           if (var18 == null) {
                              this.field330[var7] = var10;
                           }

                           var11 = var18;
                        }
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            PcmStream var16 = this.field321[var6];
            PcmStream[] var17 = this.field321;
            this.field330[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.after;
               var16.after = null;
            }
         }
      }

      if (this.field328 < 0) {
         this.field328 = 0;
      }

      if (this.stream != null) {
         this.stream.fill(var1, 0, var2);
      }

      this.timeMs = Message.method1197();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Laa;II)V",
      garbageValue = "-2144008402"
   )
   final void method801(PcmStream var1, int var2) {
      int var3 = var2 >> 5;
      PcmStream var4 = this.field330[var3];
      if (var4 == null) {
         this.field321[var3] = var1;
      } else {
         var4.after = var1;
      }

      this.field330[var3] = var1;
      var1.field383 = var2;
   }

   @ObfuscatedName("jo")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;B)V",
      garbageValue = "125"
   )
   static void method856(int var0, String var1) {
      int var2 = Players.Players_count;
      int[] var3 = Players.Players_indices;
      boolean var4 = false;
      Username var5 = new Username(var1, SecureRandomFuture.loginType);

      for(int var6 = 0; var6 < var2; ++var6) {
         Player var7 = Client.players[var3[var6]];
         if (var7 != null && var7 != class155.localPlayer && var7.username != null && var7.username.equals(var5)) {
            PacketBufferNode var8;
            if (var0 == 1) {
               var8 = class136.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
               var8.packetBuffer.writeByte(0);
               var8.packetBuffer.writeShort(var3[var6]);
               Client.packetWriter.addNode(var8);
            } else if (var0 == 4) {
               var8 = class136.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
               var8.packetBuffer.writeShort(var3[var6]);
               var8.packetBuffer.writeByteSub(0);
               Client.packetWriter.addNode(var8);
            } else if (var0 == 6) {
               var8 = class136.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
               var8.packetBuffer.writeByteSub(0);
               var8.packetBuffer.writeShort(var3[var6]);
               Client.packetWriter.addNode(var8);
            } else if (var0 == 7) {
               var8 = class136.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
               var8.packetBuffer.writeShortAddLE(var3[var6]);
               var8.packetBuffer.writeByteSub(0);
               Client.packetWriter.addNode(var8);
            }

            var4 = true;
            break;
         }
      }

      if (!var4) {
         KitDefinition.addGameMessage(4, "", "Unable to find " + var1);
      }

   }
}
