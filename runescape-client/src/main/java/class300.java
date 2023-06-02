import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
public final class class300 {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      longValue = -3820023634805219991L
   )
   static long field3364;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      longValue = 4707895085052106175L
   )
   static long field3365;

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)Lhz;",
      garbageValue = "1204136963"
   )
   @Export("ItemDefinition_get")
   public static ItemComposition ItemDefinition_get(int var0) {
      ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = ItemComposition.ItemDefinition_archive.takeFile(10, var0);
         var1 = new ItemComposition();
         var1.id = var0;
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.post();
         if (var1.noteTemplate != -1) {
            var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
         }

         if (var1.notedId != -1) {
            var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
         }

         if (var1.placeholderTemplate != -1) {
            var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
         }

         if (!ItemComposition.ItemDefinition_inMembersWorld && var1.isMembersOnly) {
            var1.name = var1.name + " (Members)";
            var1.isTradable = false;

            int var3;
            for(var3 = 0; var3 < var1.groundActions.length; ++var3) {
               var1.groundActions[var3] = null;
            }

            for(var3 = 0; var3 < var1.inventoryActions.length; ++var3) {
               if (var3 != 4) {
                  var1.inventoryActions[var3] = null;
               }
            }

            var1.shiftClickIndex = -2;
            var1.team = 0;
            if (var1.params != null) {
               boolean var6 = false;

               for(Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) {
                  ParamComposition var5 = ModeWhere.getParamDefinition((int)var4.key);
                  if (var5.autoDisable) {
                     var4.remove();
                  } else {
                     var6 = true;
                  }
               }

               if (!var6) {
                  var1.params = null;
               }
            }
         }

         ItemComposition.ItemDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2024632271"
   )
   static void method5686() {
      synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
         if (ArchiveDiskActionHandler.field4224 == 0) {
            ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
            ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
            ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
            ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
         }

         ArchiveDiskActionHandler.field4224 = 600;
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1153355231"
   )
   static final void method5687() {
      ParamComposition.method3837("Your friend list is full. Max of 200 for free users, and 400 for members");
   }

   @ObfuscatedName("mt")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "39"
   )
   static final void method5688(int var0, int var1) {
      ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : VerticalAlignment.guestClanChannel;
      if (var2 != null && var1 >= 0 && var1 < var2.method3346()) {
         ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
         if (var3.rank == -1) {
            String var4 = var3.username.getName();
            PacketBufferNode var5 = ObjectComposition.getPacketBufferNode(ClientPacket.field3120, Client.packetWriter.isaacCipher);
            var5.packetBuffer.writeByte(3 + Widget.stringCp1252NullTerminatedByteSize(var4));
            var5.packetBuffer.writeByte(var0);
            var5.packetBuffer.writeShort(var1);
            var5.packetBuffer.writeStringCp1252NullTerminated(var4);
            Client.packetWriter.addNode(var5);
         }
      }
   }
}
