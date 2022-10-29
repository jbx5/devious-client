import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
public class class197 implements class30 {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lkn;"
   )
   Widget field2233 = null;
   @ObfuscatedName("f")
   boolean field2234 = false;
   @ObfuscatedName("c")
   boolean field2235 = false;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1393279885"
   )
   public boolean vmethod3949(int var1) {
      if (this.field2233 == null) {
         return false;
      } else {
         class28 var2 = this.field2233.method6078();
         if (var2 == null) {
            return false;
         } else {
            if (var2.method429(var1)) {
               switch (var1) {
                  case 81:
                     this.field2235 = true;
                     break;
                  case 82:
                     this.field2234 = true;
                     break;
                  default:
                     if (this.method3917(var1)) {
                        class143.invalidateWidget(this.field2233);
                     }
               }
            }

            return var2.method410(var1);
         }
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1545920011"
   )
   public boolean vmethod3989(int var1) {
      switch (var1) {
         case 81:
            this.field2235 = false;
            return false;
         case 82:
            this.field2234 = false;
            return false;
         default:
            return false;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "1185620152"
   )
   public boolean vmethod3951(char var1) {
      if (this.field2233 == null) {
         return false;
      } else if (!class283.method5443(var1)) {
         return false;
      } else {
         class300 var2 = this.field2233.method6076();
         if (var2 != null && var2.method5906()) {
            class28 var3 = this.field2233.method6078();
            if (var3 == null) {
               return false;
            } else {
               if (var3.method426(var1) && var2.method5784(var1)) {
                  class143.invalidateWidget(this.field2233);
               }

               return var3.method411(var1);
            }
         } else {
            return false;
         }
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(ZB)Z",
      garbageValue = "109"
   )
   public boolean vmethod3953(boolean var1) {
      return false;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(Lkn;I)V",
      garbageValue = "-1658899548"
   )
   public void method3915(Widget var1) {
      this.method3933();
      if (var1 != null) {
         this.field2233 = var1;
         class298 var2 = var1.method6079();
         if (var2 != null) {
            var2.field3419.method5767(true);
            if (var2.field3413 != null) {
               ScriptEvent var3 = new ScriptEvent();
               var3.method2233(var1);
               var3.setArgs(var2.field3413);
               class420.method7802().addFirst(var3);
            }
         }
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)Lkn;",
      garbageValue = "1763353242"
   )
   public Widget method3916() {
      return this.field2233;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "0"
   )
   public void method3933() {
      if (this.field2233 != null) {
         class298 var1 = this.field2233.method6079();
         Widget var2 = this.field2233;
         this.field2233 = null;
         if (var1 != null) {
            var1.field3419.method5767(false);
            if (var1.field3413 != null) {
               ScriptEvent var3 = new ScriptEvent();
               var3.method2233(var2);
               var3.setArgs(var1.field3413);
               class420.method7802().addFirst(var3);
            }

         }
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1419788779"
   )
   boolean method3917(int var1) {
      if (this.field2233 == null) {
         return false;
      } else {
         class300 var2 = this.field2233.method6076();
         if (var2 != null && var2.method5906()) {
            switch (var1) {
               case 13:
                  this.method3933();
                  return true;
               case 48:
                  if (this.field2234) {
                     var2.method5770();
                  }

                  return true;
               case 65:
                  if (this.field2234) {
                     var2.method5809(MouseHandler.method676());
                  }

                  return true;
               case 66:
                  if (this.field2234) {
                     var2.method5840(MouseHandler.method676());
                  }

                  return true;
               case 67:
                  if (this.field2234) {
                     var2.method5854(MouseHandler.method676());
                  }

                  return true;
               case 84:
                  if (var2.method5829() == 0) {
                     var2.method5784(10);
                  } else if (this.field2235 && var2.method5833()) {
                     var2.method5784(10);
                  } else {
                     class298 var3 = this.field2233.method6079();
                     ScriptEvent var4 = new ScriptEvent();
                     var4.method2233(this.field2233);
                     var4.setArgs(var3.field3416);
                     class420.method7802().addFirst(var4);
                     this.method3933();
                  }

                  return true;
               case 85:
                  if (this.field2234) {
                     var2.method5787();
                  } else {
                     var2.method5823();
                  }

                  return true;
               case 96:
                  if (this.field2234) {
                     var2.method5798(this.field2235);
                  } else {
                     var2.method6028(this.field2235);
                  }

                  return true;
               case 97:
                  if (this.field2234) {
                     var2.method5799(this.field2235);
                  } else {
                     var2.method5786(this.field2235);
                  }

                  return true;
               case 98:
                  if (this.field2234) {
                     var2.method5917();
                  } else {
                     var2.method5886(this.field2235);
                  }

                  return true;
               case 99:
                  if (this.field2234) {
                     var2.method5804();
                  } else {
                     var2.method6010(this.field2235);
                  }

                  return true;
               case 101:
                  if (this.field2234) {
                     var2.method5953();
                  } else {
                     var2.method5872();
                  }

                  return true;
               case 102:
                  if (this.field2234) {
                     var2.method5867(this.field2235);
                  } else {
                     var2.method5792(this.field2235);
                  }

                  return true;
               case 103:
                  if (this.field2234) {
                     var2.method5825(this.field2235);
                  } else {
                     var2.method5853(this.field2235);
                  }

                  return true;
               case 104:
                  if (this.field2234) {
                     var2.method5937(this.field2235);
                  } else {
                     var2.method5768(this.field2235);
                  }

                  return true;
               case 105:
                  if (this.field2234) {
                     var2.method5805(this.field2235);
                  } else {
                     var2.method5803(this.field2235);
                  }

                  return true;
               default:
                  return false;
            }
         } else {
            return false;
         }
      }
   }

   @ObfuscatedName("a")
   public static final void method3946(long var0) {
      if (var0 > 0L) {
         if (var0 % 10L == 0L) {
            class248.method5160(var0 - 1L);
            class248.method5160(1L);
         } else {
            class248.method5160(var0);
         }

      }
   }

   @ObfuscatedName("lw")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-1317494492"
   )
   @Export("Clan_joinChat")
   static final void Clan_joinChat(String var0) {
      if (!var0.equals("")) {
         PacketBufferNode var1 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3006, Client.packetWriter.isaacCipher);
         var1.packetBuffer.writeByte(Actor.stringCp1252NullTerminatedByteSize(var0));
         var1.packetBuffer.writeStringCp1252NullTerminated(var0);
         Client.packetWriter.addNode(var1);
      }
   }

   @ObfuscatedName("ly")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1343793560"
   )
   static final void method3914(int var0, int var1) {
      if (Client.currentClanChannels[var0] != null) {
         if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3215()) {
            ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
            if (var2.rank == -1) {
               PacketBufferNode var3 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3071, Client.packetWriter.isaacCipher);
               var3.packetBuffer.writeByte(3 + Actor.stringCp1252NullTerminatedByteSize(var2.username.getName()));
               var3.packetBuffer.writeByte(var0);
               var3.packetBuffer.writeShort(var1);
               var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
               Client.packetWriter.addNode(var3);
            }
         }
      }
   }

   @ObfuscatedName("lo")
   @ObfuscatedSignature(
      descriptor = "(Lkn;I)I",
      garbageValue = "-807542260"
   )
   @Export("getWidgetFlags")
   static int getWidgetFlags(Widget var0) {
      IntegerNode var1 = (IntegerNode)Client.widgetFlags.get((long)var0.childIndex + ((long)var0.id << 32));
      return var1 != null ? var1.integer : var0.flags;
   }
}
