import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
final class class104 implements class321 {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Ltj;"
   )
   @Export("options_buttons_0Sprite")
   static IndexedSprite options_buttons_0Sprite;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lmb;"
   )
   final Widget val$cc;

   @ObfuscatedSignature(
      descriptor = "(Lmb;)V"
   )
   class104(Widget var1) {
      this.val$cc = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "51"
   )
   public void vmethod5986() {
      if (this.val$cc != null && this.val$cc.method6383().field3533 != null) {
         ScriptEvent var1 = new ScriptEvent();
         var1.method2247(this.val$cc);
         var1.setArgs(this.val$cc.method6383().field3533);
         Message.method1177().addFirst(var1);
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "([BZI)Ljava/lang/Object;",
      garbageValue = "1467572188"
   )
   public static Object method2665(byte[] var0, boolean var1) {
      if (var0 == null) {
         return null;
      } else if (var0.length > 136) {
         DirectByteArrayCopier var2 = new DirectByteArrayCopier();
         var2.set(var0);
         return var2;
      } else {
         return var0;
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "181839988"
   )
   @Export("Messages_getLastChatID")
   static int Messages_getLastChatID(int var0) {
      Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
      if (var1 == null) {
         return -1;
      } else {
         return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count;
      }
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1413449120"
   )
   static void method2672() {
      class390.method7249(24);
      class478.setLoginResponseString("", "You were disconnected from the server.", "");
   }

   @ObfuscatedName("ij")
   @ObfuscatedSignature(
      descriptor = "(Ldi;B)V",
      garbageValue = "0"
   )
   static final void method2671(Actor var0) {
      var0.isWalking = false;
      if (var0.movementSequence != -1) {
         SequenceDefinition var1 = WorldMapLabelSize.SequenceDefinition_get(var0.movementSequence);
         if (var1 != null) {
            if (!var1.isCachedModelIdSet() && var1.frameIds != null) {
               ++var0.movementFrameCycle;
               if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) {
                  var0.movementFrameCycle = 1;
                  ++var0.movementFrame;
                  FaceNormal.method4718(var1, var0.movementFrame, var0.x, var0.y);
               }

               if (var0.movementFrame >= var1.frameIds.length) {
                  if (var1.frameCount > 0) {
                     var0.movementFrame -= var1.frameCount;
                     if (var1.field2296) {
                        ++var0.field1195;
                     }

                     if (var0.movementFrame < 0 || var0.movementFrame >= var1.frameIds.length || var1.field2296 && var0.field1195 >= var1.field2297) {
                        var0.movementFrameCycle = 0;
                        var0.movementFrame = 0;
                        var0.field1195 = 0;
                     }
                  } else {
                     var0.movementFrameCycle = 0;
                     var0.movementFrame = 0;
                  }

                  FaceNormal.method4718(var1, var0.movementFrame, var0.x, var0.y);
               }
            } else if (var1.isCachedModelIdSet()) {
               ++var0.movementFrame;
               int var2 = var1.method4084();
               if (var0.movementFrame < var2) {
                  ModeWhere.method6916(var1, var0.movementFrame, var0.x, var0.y);
               } else {
                  if (var1.frameCount > 0) {
                     var0.movementFrame -= var1.frameCount;
                     if (var1.field2296) {
                        ++var0.field1195;
                     }

                     if (var0.movementFrame < 0 || var0.movementFrame >= var2 || var1.field2296 && var0.field1195 >= var1.field2297) {
                        var0.movementFrame = 0;
                        var0.movementFrameCycle = 0;
                        var0.field1195 = 0;
                     }
                  } else {
                     var0.movementFrameCycle = 0;
                     var0.movementFrame = 0;
                  }

                  ModeWhere.method6916(var1, var0.movementFrame, var0.x, var0.y);
               }
            } else {
               var0.movementSequence = -1;
            }
         } else {
            var0.movementSequence = -1;
         }
      }

      IterableNodeHashTableIterator var7 = new IterableNodeHashTableIterator(var0.method2391());

      int var3;
      for(ActorSpotAnim var6 = (ActorSpotAnim)var7.method8589(); var6 != null; var6 = (ActorSpotAnim)var7.next()) {
         if (var6.spotAnimation != -1 && Client.cycle >= var6.field5170) {
            var3 = class53.SpotAnimationDefinition_get(var6.spotAnimation).sequence;
            if (var3 == -1) {
               var6.remove();
               --var0.graphicsCount;
            } else {
               var6.spotAnimationFrame = Math.max(var6.spotAnimationFrame, 0);
               SequenceDefinition var4 = WorldMapLabelSize.SequenceDefinition_get(var3);
               if (var4.frameIds != null && !var4.isCachedModelIdSet()) {
                  ++var6.spotAnimationFrameCycle;
                  if (var6.spotAnimationFrame < var4.frameIds.length && var6.spotAnimationFrameCycle > var4.frameLengths[var6.spotAnimationFrame]) {
                     var6.spotAnimationFrameCycle = 1;
                     ++var6.spotAnimationFrame;
                     FaceNormal.method4718(var4, var6.spotAnimationFrame, var0.x, var0.y);
                  }

                  if (var6.spotAnimationFrame >= var4.frameIds.length) {
                     var6.remove();
                     --var0.graphicsCount;
                  }
               } else if (var4.isCachedModelIdSet()) {
                  ++var6.spotAnimationFrame;
                  int var5 = var4.method4084();
                  if (var6.spotAnimationFrame < var5) {
                     ModeWhere.method6916(var4, var6.spotAnimationFrame, var0.x, var0.y);
                  } else {
                     var6.remove();
                     --var0.graphicsCount;
                  }
               } else {
                  var6.remove();
                  --var0.graphicsCount;
               }
            }
         }
      }

      SequenceDefinition var8;
      if (var0.sequence != -1 && var0.sequenceDelay <= 1) {
         var8 = WorldMapLabelSize.SequenceDefinition_get(var0.sequence);
         if (var8.field2287 == 1 && var0.field1226 > 0 && var0.spotAnimation <= Client.cycle && var0.field1208 < Client.cycle) {
            var0.sequenceDelay = 1;
            return;
         }
      }

      if (var0.sequence != -1 && var0.sequenceDelay == 0) {
         var8 = WorldMapLabelSize.SequenceDefinition_get(var0.sequence);
         if (var8 != null) {
            if (!var8.isCachedModelIdSet() && var8.frameIds != null) {
               ++var0.sequenceFrameCycle;
               if (var0.sequenceFrame < var8.frameIds.length && var0.sequenceFrameCycle > var8.frameLengths[var0.sequenceFrame]) {
                  var0.sequenceFrameCycle = 1;
                  ++var0.sequenceFrame;
                  FaceNormal.method4718(var8, var0.sequenceFrame, var0.x, var0.y);
               }

               if (var0.sequenceFrame >= var8.frameIds.length) {
                  var0.sequenceFrame -= var8.frameCount;
                  ++var0.field1200;
                  if (var0.field1200 >= var8.field2297) {
                     var0.sequence = -1;
                  } else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var8.frameIds.length) {
                     FaceNormal.method4718(var8, var0.sequenceFrame, var0.x, var0.y);
                  } else {
                     var0.sequence = -1;
                  }
               }

               var0.isWalking = var8.field2273;
            } else if (var8.isCachedModelIdSet()) {
               ++var0.sequenceFrame;
               var3 = var8.method4084();
               if (var0.sequenceFrame < var3) {
                  ModeWhere.method6916(var8, var0.sequenceFrame, var0.x, var0.y);
               } else {
                  var0.sequenceFrame -= var8.frameCount;
                  ++var0.field1200;
                  if (var0.field1200 >= var8.field2297) {
                     var0.sequence = -1;
                  } else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var3) {
                     ModeWhere.method6916(var8, var0.sequenceFrame, var0.x, var0.y);
                  } else {
                     var0.sequence = -1;
                  }
               }
            } else {
               var0.sequence = -1;
            }
         } else {
            var0.sequence = -1;
         }
      }

      if (var0.sequenceDelay > 0) {
         --var0.sequenceDelay;
      }

   }

   @ObfuscatedName("ip")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1396951833"
   )
   static boolean method2664() {
      return (Client.drawPlayerNames & 8) != 0;
   }

   @ObfuscatedName("lx")
   @ObfuscatedSignature(
      descriptor = "([Lmb;IIIZI)V",
      garbageValue = "1776735016"
   )
   @Export("resizeInterface")
   static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
      for(int var5 = 0; var5 < var0.length; ++var5) {
         Widget var6 = var0[var5];
         if (var6 != null && var6.parentId == var1) {
            SoundSystem.alignWidgetSize(var6, var2, var3, var4);
            class140.alignWidgetPosition(var6, var2, var3);
            if (var6.scrollX > var6.scrollWidth - var6.width) {
               var6.scrollX = var6.scrollWidth - var6.width;
            }

            if (var6.scrollX < 0) {
               var6.scrollX = 0;
            }

            if (var6.scrollY > var6.scrollHeight - var6.height) {
               var6.scrollY = var6.scrollHeight - var6.height;
            }

            if (var6.scrollY < 0) {
               var6.scrollY = 0;
            }

            if (var6.type == 0) {
               Projectile.revalidateWidgetScroll(var0, var6, var4);
            }
         }
      }

   }
}
