import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
public class class363 extends AbstractQueue {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "[Lms;"
   )
   class361[] field4325;
   @ObfuscatedName("f")
   Map field4320;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 333369771
   )
   int field4322;
   @ObfuscatedName("x")
   final Comparator field4323;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1357069319
   )
   int field4324;

   public class363(int var1, Comparator var2) {
      this.field4324 = 0;
      this.field4325 = new class361[var1];
      this.field4320 = new HashMap();
      this.field4323 = var2;
   }

   public class363(int var1) {
      this(var1, (Comparator)null);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1439807432"
   )
   void method6848() {
      int var1 = (this.field4325.length << 1) + 1;
      this.field4325 = (class361[])((class361[])Arrays.copyOf(this.field4325, var1));
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-2040074955"
   )
   void method6854(int var1) {
      class361 var2;
      int var3;
      for(var2 = this.field4325[var1]; var1 > 0; var1 = var3) {
         var3 = var1 - 1 >>> 1;
         class361 var4 = this.field4325[var3];
         if (this.field4323 != null) {
            if (this.field4323.compare(var2.field4310, var4.field4310) >= 0) {
               break;
            }
         } else if (((Comparable)var2.field4310).compareTo(var4.field4310) >= 0) {
            break;
         }

         this.field4325[var1] = var4;
         this.field4325[var1].field4311 = var1;
      }

      this.field4325[var1] = var2;
      this.field4325[var1].field4311 = var1;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1431717548"
   )
   void method6850(int var1) {
      class361 var2 = this.field4325[var1];

      int var8;
      for(int var3 = this.field4322 >>> 1; var1 < var3; var1 = var8) {
         int var4 = (var1 << 1) + 1;
         class361 var5 = this.field4325[var4];
         int var6 = (var1 << 1) + 2;
         class361 var7 = this.field4325[var6];
         if (this.field4323 != null) {
            if (var6 < this.field4322 && this.field4323.compare(var5.field4310, var7.field4310) > 0) {
               var8 = var6;
            } else {
               var8 = var4;
            }
         } else if (var6 < this.field4322 && ((Comparable)var5.field4310).compareTo(var7.field4310) > 0) {
            var8 = var6;
         } else {
            var8 = var4;
         }

         if (this.field4323 != null) {
            if (this.field4323.compare(var2.field4310, this.field4325[var8].field4310) <= 0) {
               break;
            }
         } else if (((Comparable)var2.field4310).compareTo(this.field4325[var8].field4310) <= 0) {
            break;
         }

         this.field4325[var1] = this.field4325[var8];
         this.field4325[var1].field4311 = var1;
      }

      this.field4325[var1] = var2;
      this.field4325[var1].field4311 = var1;
   }

   public boolean remove(Object var1) {
      class361 var2 = (class361)this.field4320.remove(var1);
      if (var2 == null) {
         return false;
      } else {
         ++this.field4324;
         --this.field4322;
         if (var2.field4311 == this.field4322) {
            this.field4325[this.field4322] = null;
            return true;
         } else {
            class361 var3 = this.field4325[this.field4322];
            this.field4325[this.field4322] = null;
            this.field4325[var2.field4311] = var3;
            this.field4325[var2.field4311].field4311 = var2.field4311;
            this.method6850(var2.field4311);
            if (var3 == this.field4325[var2.field4311]) {
               this.method6854(var2.field4311);
            }

            return true;
         }
      }
   }

   public Object peek() {
      return this.field4322 == 0 ? null : this.field4325[0].field4310;
   }

   public int size() {
      return this.field4322;
   }

   public boolean offer(Object var1) {
      if (this.field4320.containsKey(var1)) {
         throw new IllegalArgumentException("");
      } else {
         ++this.field4324;
         int var2 = this.field4322;
         if (var2 >= this.field4325.length) {
            this.method6848();
         }

         ++this.field4322;
         if (var2 == 0) {
            this.field4325[0] = new class361(var1, 0);
            this.field4320.put(var1, this.field4325[0]);
         } else {
            this.field4325[var2] = new class361(var1, var2);
            this.field4320.put(var1, this.field4325[var2]);
            this.method6854(var2);
         }

         return true;
      }
   }

   public Object poll() {
      if (this.field4322 == 0) {
         return null;
      } else {
         ++this.field4324;
         Object var1 = this.field4325[0].field4310;
         this.field4320.remove(var1);
         --this.field4322;
         if (this.field4322 == 0) {
            this.field4325[this.field4322] = null;
         } else {
            this.field4325[0] = this.field4325[this.field4322];
            this.field4325[0].field4311 = 0;
            this.field4325[this.field4322] = null;
            this.method6850(0);
         }

         return var1;
      }
   }

   public boolean contains(Object var1) {
      return this.field4320.containsKey(var1);
   }

   public Object[] toArray() {
      Object[] var1 = super.toArray();
      if (this.field4323 != null) {
         Arrays.sort(var1, this.field4323);
      } else {
         Arrays.sort(var1);
      }

      return var1;
   }

   public Iterator iterator() {
      return new class362(this);
   }

   @ObfuscatedName("ib")
   @ObfuscatedSignature(
      descriptor = "(Ljk;I)V",
      garbageValue = "-1489380866"
   )
   static final void method6873(class273 var0) {
      PacketBuffer var1 = Client.packetWriter.packetBuffer;
      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      Projectile var35;
      if (class273.field3112 == var0) {
         var2 = var1.readUnsignedShortAdd();
         var3 = var1.readUnsignedByteAdd() * 4;
         byte var38 = var1.readByte();
         var5 = var1.readUnsignedShortLE();
         var6 = var1.readUnsignedByteNeg();
         var7 = var1.readUnsignedByteAdd();
         var8 = var1.method8438();
         var9 = var1.readUnsignedByte();
         var10 = (var9 >> 4 & 7) + DevicePcmPlayerProvider.field122;
         var11 = (var9 & 7) + class11.field64;
         byte var40 = var1.readByteNeg();
         var13 = var1.readUnsignedByteSub() * 4;
         var14 = var1.readUnsignedShortLE();
         var4 = var38 + var10;
         var12 = var40 + var11;
         if (var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104 && var4 >= 0 && var12 >= 0 && var4 < 104 && var12 < 104 && var5 != 65535) {
            var10 = var10 * 128 + 64;
            var11 = var11 * 128 + 64;
            var4 = var4 * 128 + 64;
            var12 = var12 * 128 + 64;
            var35 = new Projectile(var5, ApproximateRouteStrategy.Client_plane, var10, var11, class132.getTileHeight(var10, var11, ApproximateRouteStrategy.Client_plane) - var13, var2 + Client.cycle, var14 + Client.cycle, var6, var7, var8, var3);
            var35.setDestination(var4, var12, class132.getTileHeight(var4, var12, ApproximateRouteStrategy.Client_plane) - var3, var2 + Client.cycle);
            Client.projectiles.addFirst(var35);
         }

      } else {
         if (class273.field3109 == var0) {
            var2 = var1.readUnsignedShortLE();
            var3 = var1.readUnsignedByteAdd();
            var4 = var1.readUnsignedByteAdd();
            var5 = var4 >> 4 & 15;
            var6 = var4 & 7;
            var7 = var1.readUnsignedByteAdd();
            var8 = (var7 >> 4 & 7) + DevicePcmPlayerProvider.field122;
            var9 = (var7 & 7) + class11.field64;
            if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
               var10 = var5 + 1;
               if (class296.localPlayer.pathX[0] >= var8 - var10 && class296.localPlayer.pathX[0] <= var10 + var8 && class296.localPlayer.pathY[0] >= var9 - var10 && class296.localPlayer.pathY[0] <= var9 + var10 && BufferedSink.clientPreferences.method2411() != 0 && var6 > 0 && Client.soundEffectCount < 50) {
                  Client.soundEffectIds[Client.soundEffectCount] = var2;
                  Client.queuedSoundEffectLoops[Client.soundEffectCount] = var6;
                  Client.queuedSoundEffectDelays[Client.soundEffectCount] = var3;
                  Client.soundEffects[Client.soundEffectCount] = null;
                  Client.soundLocations[Client.soundEffectCount] = var5 + (var9 << 8) + (var8 << 16);
                  ++Client.soundEffectCount;
               }
            }
         }

         TileItem var43;
         if (class273.field3108 == var0) {
            var1.readUnsignedShortAddLE();
            var2 = var1.readUnsignedShortAdd();
            var3 = var1.readUnsignedByteAdd();
            var4 = (var3 >> 4 & 7) + DevicePcmPlayerProvider.field122;
            var5 = (var3 & 7) + class11.field64;
            if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
               NodeDeque var36 = Client.groundItems[ApproximateRouteStrategy.Client_plane][var4][var5];
               if (var36 != null) {
                  for(var43 = (TileItem)var36.last(); var43 != null; var43 = (TileItem)var36.previous()) {
                     if ((var2 & 32767) == var43.id) {
                        var43.remove();
                        break;
                     }
                  }

                  if (var36.last() == null) {
                     Client.groundItems[ApproximateRouteStrategy.Client_plane][var4][var5] = null;
                  }

                  class162.updateItemPile(var4, var5);
               }
            }

         } else {
            byte var37;
            if (class273.field3106 == var0) {
               var2 = var1.readUnsignedShortAddLE();
               var37 = var1.readByteNeg();
               var4 = var1.readUnsignedByte();
               var5 = var4 >> 2;
               var6 = var4 & 3;
               var7 = Client.field565[var5];
               var8 = var1.readUnsignedByte();
               var9 = (var8 >> 4 & 7) + DevicePcmPlayerProvider.field122;
               var10 = (var8 & 7) + class11.field64;
               var11 = var1.readByte();
               var12 = var1.readByteNeg();
               var13 = var1.readByteSub();
               var14 = var1.readUnsignedShort();
               int var15 = var1.readUnsignedShortAddLE();
               int var16 = var1.readUnsignedShortAdd();
               Player var17;
               if (var15 == Client.localPlayerIndex) {
                  var17 = class296.localPlayer;
               } else {
                  var17 = Client.players[var15];
               }

               if (var17 != null) {
                  ObjectComposition var18 = InterfaceParent.getObjectDefinition(var16);
                  int var19;
                  int var20;
                  if (var6 != 1 && var6 != 3) {
                     var19 = var18.sizeX;
                     var20 = var18.sizeY;
                  } else {
                     var19 = var18.sizeY;
                     var20 = var18.sizeX;
                  }

                  int var21 = var9 + (var19 >> 1);
                  int var22 = var9 + (var19 + 1 >> 1);
                  int var23 = var10 + (var20 >> 1);
                  int var24 = var10 + (var20 + 1 >> 1);
                  int[][] var25 = Tiles.Tiles_heights[ApproximateRouteStrategy.Client_plane];
                  int var26 = var25[var22][var24] + var25[var21][var23] + var25[var22][var23] + var25[var21][var24] >> 2;
                  int var27 = (var9 << 7) + (var19 << 6);
                  int var28 = (var10 << 7) + (var20 << 6);
                  Model var29 = var18.getModel(var5, var6, var25, var27, var26, var28);
                  if (var29 != null) {
                     NetFileRequest.method6340(ApproximateRouteStrategy.Client_plane, var9, var10, var7, -1, 0, 0, 31, var2 + 1, var14 + 1);
                     var17.animationCycleStart = var2 + Client.cycle;
                     var17.animationCycleEnd = var14 + Client.cycle;
                     var17.model0 = var29;
                     var17.field1095 = var9 * 128 + var19 * 64;
                     var17.field1100 = var10 * 128 + var20 * 64;
                     var17.tileHeight2 = var26;
                     byte var30;
                     if (var11 > var12) {
                        var30 = (byte)var11;
                        var11 = var12;
                        var12 = var30;
                     }

                     if (var37 > var13) {
                        var30 = var37;
                        var37 = (byte)var13;
                        var13 = var30;
                     }

                     var17.minX = var11 + var9;
                     var17.maxX = var12 + var9;
                     var17.minY = var37 + var10;
                     var17.maxY = var10 + var13;
                  }
               }
            }

            if (class273.field3111 == var0) {
               var2 = var1.readUnsignedByteNeg() * 4;
               var37 = var1.readByte();
               var4 = var1.readUnsignedShortAddLE();
               var5 = var1.readUnsignedShortLE();
               var6 = var1.readUnsignedShortAddLE();
               var7 = var1.readUnsignedByteNeg();
               var8 = var1.readUnsignedByteNeg() * 4;
               byte var39 = var1.readByteSub();
               var10 = var1.readUnsignedByteSub();
               var11 = (var10 >> 4 & 7) + DevicePcmPlayerProvider.field122;
               var12 = (var10 & 7) + class11.field64;
               var13 = var1.readShortLE();
               var14 = var1.readUnsignedByte();
               var9 = var39 + var11;
               var3 = var37 + var12;
               if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104 && var9 >= 0 && var3 >= 0 && var9 < 104 && var3 < 104 && var4 != 65535) {
                  var11 = var11 * 128 + 64;
                  var12 = var12 * 128 + 64;
                  var9 = var9 * 128 + 64;
                  var3 = var3 * 128 + 64;
                  var35 = new Projectile(var4, ApproximateRouteStrategy.Client_plane, var11, var12, class132.getTileHeight(var11, var12, ApproximateRouteStrategy.Client_plane) - var2, var6 + Client.cycle, var5 + Client.cycle, var14, var7, var13, var8);
                  var35.setDestination(var9, var3, class132.getTileHeight(var9, var3, ApproximateRouteStrategy.Client_plane) - var8, var6 + Client.cycle);
                  Client.projectiles.addFirst(var35);
               }

            } else if (class273.field3114 == var0) {
               var2 = var1.readUnsignedByteSub();
               var3 = var1.readUnsignedShort();
               var4 = var1.readUnsignedByte();
               var5 = (var4 >> 4 & 7) + DevicePcmPlayerProvider.field122;
               var6 = (var4 & 7) + class11.field64;
               var7 = var1.readUnsignedShortAdd();
               if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                  var5 = var5 * 128 + 64;
                  var6 = var6 * 128 + 64;
                  GraphicsObject var42 = new GraphicsObject(var7, ApproximateRouteStrategy.Client_plane, var5, var6, class132.getTileHeight(var5, var6, ApproximateRouteStrategy.Client_plane) - var2, var3, Client.cycle);
                  Client.graphicsObjects.addFirst(var42);
               }

            } else if (class273.field3119 == var0) {
               var2 = var1.readUnsignedByteSub();
               var3 = var2 >> 2;
               var4 = var2 & 3;
               var5 = Client.field565[var3];
               var6 = var1.readUnsignedShort();
               var7 = var1.readUnsignedByte();
               var8 = (var7 >> 4 & 7) + DevicePcmPlayerProvider.field122;
               var9 = (var7 & 7) + class11.field64;
               if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                  NetFileRequest.method6340(ApproximateRouteStrategy.Client_plane, var8, var9, var5, var6, var3, var4, 31, 0, -1);
               }

            } else if (class273.field3110 == var0) {
               var2 = var1.readUnsignedShort();
               var3 = var1.readUnsignedByteAdd();
               var4 = (var3 >> 4 & 7) + DevicePcmPlayerProvider.field122;
               var5 = (var3 & 7) + class11.field64;
               var6 = var1.readUnsignedShortAddLE();
               if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                  var43 = new TileItem();
                  var43.id = var6;
                  var43.quantity = var2;
                  if (Client.groundItems[ApproximateRouteStrategy.Client_plane][var4][var5] == null) {
                     Client.groundItems[ApproximateRouteStrategy.Client_plane][var4][var5] = new NodeDeque();
                  }

                  Client.groundItems[ApproximateRouteStrategy.Client_plane][var4][var5].addFirst(var43);
                  class162.updateItemPile(var4, var5);
               }

            } else if (class273.field3107 == var0) {
               var2 = var1.readUnsignedByteSub();
               var3 = (var2 >> 4 & 7) + DevicePcmPlayerProvider.field122;
               var4 = (var2 & 7) + class11.field64;
               var5 = var1.readUnsignedShortAdd();
               var6 = var1.readUnsignedByteAdd();
               var7 = var6 >> 2;
               var8 = var6 & 3;
               var9 = Client.field565[var7];
               if (var3 >= 0 && var4 >= 0 && var3 < 103 && var4 < 103) {
                  if (var9 == 0) {
                     BoundaryObject var34 = class139.scene.method4293(ApproximateRouteStrategy.Client_plane, var3, var4);
                     if (var34 != null) {
                        var11 = AttackOption.Entity_unpackID(var34.tag);
                        if (var7 == 2) {
                           var34.renderable1 = new DynamicObject(var11, 2, var8 + 4, ApproximateRouteStrategy.Client_plane, var3, var4, var5, false, var34.renderable1);
                           var34.renderable2 = new DynamicObject(var11, 2, var8 + 1 & 3, ApproximateRouteStrategy.Client_plane, var3, var4, var5, false, var34.renderable2);
                        } else {
                           var34.renderable1 = new DynamicObject(var11, var7, var8, ApproximateRouteStrategy.Client_plane, var3, var4, var5, false, var34.renderable1);
                        }
                     }
                  }

                  if (var9 == 1) {
                     WallDecoration var44 = class139.scene.method4294(ApproximateRouteStrategy.Client_plane, var3, var4);
                     if (var44 != null) {
                        var11 = AttackOption.Entity_unpackID(var44.tag);
                        if (var7 != 4 && var7 != 5) {
                           if (var7 == 6) {
                              var44.renderable1 = new DynamicObject(var11, 4, var8 + 4, ApproximateRouteStrategy.Client_plane, var3, var4, var5, false, var44.renderable1);
                           } else if (var7 == 7) {
                              var44.renderable1 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, ApproximateRouteStrategy.Client_plane, var3, var4, var5, false, var44.renderable1);
                           } else if (var7 == 8) {
                              var44.renderable1 = new DynamicObject(var11, 4, var8 + 4, ApproximateRouteStrategy.Client_plane, var3, var4, var5, false, var44.renderable1);
                              var44.renderable2 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, ApproximateRouteStrategy.Client_plane, var3, var4, var5, false, var44.renderable2);
                           }
                        } else {
                           var44.renderable1 = new DynamicObject(var11, 4, var8, ApproximateRouteStrategy.Client_plane, var3, var4, var5, false, var44.renderable1);
                        }
                     }
                  }

                  if (var9 == 2) {
                     GameObject var45 = class139.scene.getGameObject(ApproximateRouteStrategy.Client_plane, var3, var4);
                     if (var7 == 11) {
                        var7 = 10;
                     }

                     if (var45 != null) {
                        var45.renderable = new DynamicObject(AttackOption.Entity_unpackID(var45.tag), var7, var8, ApproximateRouteStrategy.Client_plane, var3, var4, var5, false, var45.renderable);
                     }
                  }

                  if (var9 == 3) {
                     FloorDecoration var46 = class139.scene.getFloorDecoration(ApproximateRouteStrategy.Client_plane, var3, var4);
                     if (var46 != null) {
                        var46.renderable = new DynamicObject(AttackOption.Entity_unpackID(var46.tag), 22, var8, ApproximateRouteStrategy.Client_plane, var3, var4, var5, false, var46.renderable);
                     }
                  }
               }

            } else if (class273.field3116 == var0) {
               var2 = var1.readUnsignedByteNeg();
               var3 = (var2 >> 4 & 7) + DevicePcmPlayerProvider.field122;
               var4 = (var2 & 7) + class11.field64;
               var5 = var1.readUnsignedShortLE();
               var6 = var1.readUnsignedShortLE();
               var7 = var1.readUnsignedShort();
               if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                  NodeDeque var41 = Client.groundItems[ApproximateRouteStrategy.Client_plane][var3][var4];
                  if (var41 != null) {
                     for(TileItem var33 = (TileItem)var41.last(); var33 != null; var33 = (TileItem)var41.previous()) {
                        if ((var7 & 32767) == var33.id && var5 == var33.quantity) {
                           var33.quantity = var6;
                           break;
                        }
                     }

                     class162.updateItemPile(var3, var4);
                  }
               }

            } else {
               TileItem var31;
               if (class273.field3117 != var0) {
                  if (class273.field3113 == var0) {
                     var2 = var1.readUnsignedByte();
                     var3 = var2 >> 2;
                     var4 = var2 & 3;
                     var5 = Client.field565[var3];
                     var6 = var1.readUnsignedByte();
                     var7 = (var6 >> 4 & 7) + DevicePcmPlayerProvider.field122;
                     var8 = (var6 & 7) + class11.field64;
                     if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                        NetFileRequest.method6340(ApproximateRouteStrategy.Client_plane, var7, var8, var5, -1, var3, var4, 31, 0, -1);
                     }

                  } else if (class273.field3121 == var0) {
                     var2 = var1.readUnsignedByte();
                     var3 = var1.readUnsignedIntLE();
                     var4 = var1.readUnsignedByteNeg();
                     var5 = (var4 >> 4 & 7) + DevicePcmPlayerProvider.field122;
                     var6 = (var4 & 7) + class11.field64;
                     var7 = var1.readUnsignedShortAdd();
                     if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                        var31 = new TileItem();
                        var31.id = var7;
                        var31.quantity = var3;
                        var31.method2545(var2);
                        if (Client.groundItems[ApproximateRouteStrategy.Client_plane][var5][var6] == null) {
                           Client.groundItems[ApproximateRouteStrategy.Client_plane][var5][var6] = new NodeDeque();
                        }

                        Client.groundItems[ApproximateRouteStrategy.Client_plane][var5][var6].addFirst(var31);
                        class162.updateItemPile(var5, var6);
                     }

                  } else if (class273.field3118 == var0) {
                     var2 = var1.readUnsignedShortAdd();
                     var3 = var1.readUnsignedByteAdd();
                     var4 = var1.readUnsignedByteSub();
                     var5 = (var4 >> 4 & 7) + DevicePcmPlayerProvider.field122;
                     var6 = (var4 & 7) + class11.field64;
                     var7 = var1.readUnsignedByteAdd();
                     var8 = var7 >> 2;
                     var9 = var7 & 3;
                     var10 = Client.field565[var8];
                     if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                        NetFileRequest.method6340(ApproximateRouteStrategy.Client_plane, var5, var6, var10, var2, var8, var9, var3, 0, -1);
                     }

                  }
               } else {
                  var2 = var1.readUnsignedByteNeg();
                  var3 = (var2 >> 4 & 7) + DevicePcmPlayerProvider.field122;
                  var4 = (var2 & 7) + class11.field64;
                  var5 = var1.readUnsignedByteAdd();
                  var6 = var1.readUnsignedShortAddLE();
                  if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                     NodeDeque var32 = Client.groundItems[ApproximateRouteStrategy.Client_plane][var3][var4];
                     if (var32 != null) {
                        for(var31 = (TileItem)var32.last(); var31 != null; var31 = (TileItem)var32.previous()) {
                           if ((var6 & 32767) == var31.id) {
                              var31.method2545(var5);
                              break;
                           }
                        }
                     }
                  }

               }
            }
         }
      }
   }
}
