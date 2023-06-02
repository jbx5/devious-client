import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("ChatChannel")
public class ChatChannel {
   @ObfuscatedName("vc")
   @ObfuscatedSignature(
      descriptor = "Lrk;"
   )
   @Export("platformInfo")
   static PlatformInfo platformInfo;
   @ObfuscatedName("fn")
   @ObfuscatedSignature(
      descriptor = "Lny;"
   )
   @Export("archive19")
   static Archive archive19;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "[Lcg;"
   )
   @Export("messages")
   Message[] messages = new Message[100];
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -245649209
   )
   @Export("count")
   int count;

   ChatChannel() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)Lcg;",
      garbageValue = "10654"
   )
   @Export("addMessage")
   Message addMessage(int var1, String var2, String var3, String var4) {
      Message var5 = this.messages[99];

      for(int var6 = this.count; var6 > 0; --var6) {
         if (var6 != 100) {
            this.messages[var6] = this.messages[var6 - 1];
         }
      }

      if (var5 == null) {
         var5 = new Message(var1, var2, var4, var3);
      } else {
         var5.remove();
         var5.removeDual();
         var5.set(var1, var2, var4, var3);
      }

      this.messages[0] = var5;
      if (this.count < 100) {
         ++this.count;
      }

      return var5;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)Lcg;",
      garbageValue = "-651890081"
   )
   @Export("getMessage")
   Message getMessage(int var1) {
      return var1 >= 0 && var1 < this.count ? this.messages[var1] : null;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "387779060"
   )
   @Export("size")
   int size() {
      return this.count;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(IZB)Ljava/lang/String;",
      garbageValue = "72"
   )
   @Export("intToString")
   public static String intToString(int var0, boolean var1) {
      if (var1 && var0 >= 0) {
         int var3 = var0;
         String var2;
         if (var1 && var0 >= 0) {
            int var4 = 2;

            for(int var5 = var0 / 10; var5 != 0; ++var4) {
               var5 /= 10;
            }

            char[] var6 = new char[var4];
            var6[0] = '+';

            for(int var7 = var4 - 1; var7 > 0; --var7) {
               int var8 = var3;
               var3 /= 10;
               int var9 = var8 - var3 * 10;
               if (var9 >= 10) {
                  var6[var7] = (char)(var9 + 87);
               } else {
                  var6[var7] = (char)(var9 + 48);
               }
            }

            var2 = new String(var6);
         } else {
            var2 = Integer.toString(var0, 10);
         }

         return var2;
      } else {
         return Integer.toString(var0);
      }
   }

   @ObfuscatedName("iv")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-24765"
   )
   static void method2159() {
      for(class210 var0 = (class210)Client.field742.last(); var0 != null; var0 = (class210)Client.field742.previous()) {
         var0.remove();
      }

   }

   @ObfuscatedName("mf")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1221554668"
   )
   static final void method2157(int var0, int var1) {
      if (Client.currentClanChannels[var0] != null) {
         if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3346()) {
            ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
            if (var2.rank == -1) {
               PacketBufferNode var3 = ObjectComposition.getPacketBufferNode(ClientPacket.field3146, Client.packetWriter.isaacCipher);
               var3.packetBuffer.writeByte(3 + Widget.stringCp1252NullTerminatedByteSize(var2.username.getName()));
               var3.packetBuffer.writeByte(var0);
               var3.packetBuffer.writeShort(var1);
               var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
               Client.packetWriter.addNode(var3);
            }
         }
      }
   }
}
