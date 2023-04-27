import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("po")
@Implements("FriendsList")
public class FriendsList extends UserList {
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lsw;"
   )
   @Export("loginType")
   final LoginType loginType;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 2010685907
   )
   int field4555 = 1;
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Log;"
   )
   @Export("friendLoginUpdates")
   public LinkDeque friendLoginUpdates = new LinkDeque();

   @ObfuscatedSignature(
      descriptor = "(Lsw;)V"
   )
   public FriendsList(LoginType var1) {
      super(400);
      this.loginType = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)Lpw;",
      garbageValue = "1756938494"
   )
   @Export("newInstance")
   User newInstance() {
      return new Friend();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)[Lpw;",
      garbageValue = "-463450295"
   )
   @Export("newTypedArray")
   User[] newTypedArray(int var1) {
      return new Friend[var1];
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Ltm;ZI)Z",
      garbageValue = "-605757932"
   )
   @Export("isFriended")
   public boolean isFriended(Username var1, boolean var2) {
      Friend var3 = (Friend)this.getByUsername(var1);
      if (var3 == null) {
         return false;
      } else {
         return !var2 || var3.world != 0;
      }
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(Lsg;IB)V",
      garbageValue = "-80"
   )
   @Export("read")
   public void read(Buffer var1, int var2) {
      while(true) {
         if (var1.offset < var2) {
            boolean var3 = var1.readUnsignedByte() == 1;
            Username var4 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
            Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
            int var6 = var1.readUnsignedShort();
            int var7 = var1.readUnsignedByte();
            int var8 = var1.readUnsignedByte();
            boolean var9 = (var8 & 2) != 0;
            boolean var10 = (var8 & 1) != 0;
            if (var6 > 0) {
               var1.readStringCp1252NullTerminated();
               var1.readUnsignedByte();
               var1.readInt();
            }

            var1.readStringCp1252NullTerminated();
            if (var4 != null && var4.hasCleanName()) {
               Friend var11 = (Friend)this.getByCurrentUsername(var4);
               if (var3) {
                  Friend var12 = (Friend)this.getByCurrentUsername(var5);
                  if (var12 != null && var12 != var11) {
                     if (var11 != null) {
                        this.remove(var12);
                     } else {
                        var11 = var12;
                     }
                  }
               }

               if (var11 != null) {
                  this.changeName(var11, var4, var5);
                  if (var6 != var11.world) {
                     boolean var14 = true;

                     for(FriendLoginUpdate var13 = (FriendLoginUpdate)this.friendLoginUpdates.last(); var13 != null; var13 = (FriendLoginUpdate)this.friendLoginUpdates.previous()) {
                        if (var13.username.equals(var4)) {
                           if (var6 != 0 && var13.world == 0) {
                              var13.remove();
                              var14 = false;
                           } else if (var6 == 0 && var13.world != 0) {
                              var13.remove();
                              var14 = false;
                           }
                        }
                     }

                     if (var14) {
                        this.friendLoginUpdates.addFirst(new FriendLoginUpdate(var4, var6));
                     }
                  }
               } else {
                  if (this.getSize() >= 400) {
                     continue;
                  }

                  var11 = (Friend)this.addLast(var4, var5);
               }

               if (var6 != var11.world) {
                  var11.int2 = ++this.field4555 - 1;
                  if (var11.world == -1 && var6 == 0) {
                     var11.int2 = -(var11.int2 * 1270747397) * 1907692493;
                  }

                  var11.world = var6;
               }

               var11.rank = var7;
               var11.field4571 = var9;
               var11.field4570 = var10;
               continue;
            }

            throw new IllegalStateException();
         }

         this.sort();
         return;
      }
   }

   @ObfuscatedName("je")
   @ObfuscatedSignature(
      descriptor = "(Lhf;I)V",
      garbageValue = "544798953"
   )
   static void method7770(class206 var0) {
      if (var0 != null && var0.field2345 != null) {
         if (var0.field2345.childIndex >= 0) {
            Widget var1 = class165.getWidget(var0.field2345.parentId);
            if (var1 == null || var1.children == null || var1.children.length == 0 || var0.field2345.childIndex >= var1.children.length || var0.field2345 != var1.children[var0.field2345.childIndex]) {
               return;
            }
         }

         if (var0.field2345.type == 11 && var0.field2344 == 0) {
            if (var0.field2345.method6381(var0.field2348, var0.field2343, 0, 0)) {
               switch (var0.field2345.method6385()) {
                  case 0:
                     Ignored.openURL(var0.field2345.method6503(), true, false);
                     break;
                  case 1:
                     if (ObjectComposition.method4028(KeyHandler.getWidgetFlags(var0.field2345))) {
                        int[] var4 = var0.field2345.method6388();
                        if (var4 != null) {
                           PacketBufferNode var2 = class330.getPacketBufferNode(ClientPacket.field3137, Client.packetWriter.isaacCipher);
                           var2.packetBuffer.writeIntIME(var4[0]);
                           var2.packetBuffer.writeIntLE(var0.field2345.id);
                           var2.packetBuffer.writeInt(var4[1]);
                           var2.packetBuffer.writeIntME(var0.field2345.method6386());
                           var2.packetBuffer.writeIntIME(var4[2]);
                           var2.packetBuffer.writeShortLE(var0.field2345.childIndex);
                           Client.packetWriter.addNode(var2);
                        }
                     }
               }
            }
         } else if (var0.field2345.type == 12) {
            class314 var3 = var0.field2345.method6392();
            if (var3 != null && var3.method6139()) {
               switch (var0.field2344) {
                  case 0:
                     Client.field722.method4179(var0.field2345);
                     var3.method6087(true);
                     var3.method6126(var0.field2348, var0.field2343, Client.field721.method4229(82), Client.field721.method4229(81));
                     break;
                  case 1:
                     var3.method6115(var0.field2348, var0.field2343);
               }
            }
         }

      }
   }
}
