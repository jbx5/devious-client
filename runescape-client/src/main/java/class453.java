import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qi")
public class class453 implements MouseWheel {
   @ObfuscatedName("sb")
   @ObfuscatedSignature(
      descriptor = "Lal;"
   )
   @Export("pcmStreamMixer")
   static PcmStreamMixer pcmStreamMixer;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lqi;"
   )
   public static final class453 field4834 = new class453(0, 0, Integer.class, new class450());
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lqi;"
   )
   public static final class453 field4828 = new class453(2, 1, Long.class, new class452());
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lqi;"
   )
   public static final class453 field4836 = new class453(1, 2, String.class, new class454());
   @ObfuscatedName("n")
   @Export("SpriteBuffer_pixels")
   static byte[][] SpriteBuffer_pixels;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 679204281
   )
   public final int field4831;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -422385969
   )
   public final int field4832;
   @ObfuscatedName("j")
   public final Class field4833;
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Lqa;"
   )
   final class449 field4829;

   @ObfuscatedSignature(
      descriptor = "(IILjava/lang/Class;Lqa;)V"
   )
   class453(int var1, int var2, Class var3, class449 var4) {
      this.field4831 = var1;
      this.field4832 = var2;
      this.field4833 = var3;
      this.field4829 = var4;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field4832;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)Ljava/lang/Object;",
      garbageValue = "-984762042"
   )
   public Object method8257(Buffer var1) {
      return this.field4829.vmethod8273(var1);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IB)Lgb;",
      garbageValue = "124"
   )
   public static VarbitComposition method8258(int var0) {
      VarbitComposition var1 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = GrandExchangeOfferTotalQuantityComparator.VarbitDefinition_archive.takeFile(14, var0);
         var1 = new VarbitComposition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         VarbitComposition.VarbitDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)[Lqi;",
      garbageValue = "54205034"
   )
   public static class453[] method8268() {
      return new class453[]{field4836, field4828, field4834};
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(III)Lbz;",
      garbageValue = "466155203"
   )
   static Script method8261(int var0, int var1) {
      Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16));
      if (var2 != null) {
         return var2;
      } else {
         String var3 = String.valueOf(var0);
         int var4 = class188.archive12.getGroupId(var3);
         if (var4 == -1) {
            return null;
         } else {
            byte[] var5 = class188.archive12.takeFileFlat(var4);
            if (var5 != null) {
               if (var5.length <= 1) {
                  return null;
               }

               var2 = GameEngine.newScript(var5);
               if (var2 != null) {
                  Script.Script_cached.put(var2, (long)(var0 << 16));
                  return var2;
               }
            }

            return null;
         }
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Class;I)Lqi;",
      garbageValue = "400307690"
   )
   public static class453 method8255(Class var0) {
      class453[] var1 = method8268();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class453 var3 = var1[var2];
         if (var3.field4833 == var0) {
            return var3;
         }
      }

      return null;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;Lqr;I)V",
      garbageValue = "16983034"
   )
   public static void method8265(Object var0, Buffer var1) {
      Class var3 = var0.getClass();
      class453 var4 = method8255(var3);
      if (var4 == null) {
         throw new IllegalArgumentException();
      } else {
         class449 var2 = var4.field4829;
         var2.vmethod8274(var0, var1);
      }
   }

   @ObfuscatedName("hr")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1107296256"
   )
   static boolean method8254() {
      return (Client.drawPlayerNames & 8) != 0;
   }

   @ObfuscatedName("jg")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "319342817"
   )
   @Export("resumePauseWidget")
   static void resumePauseWidget(int var0, int var1) {
      PacketBufferNode var2 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.RESUME_PAUSEBUTTON, Client.packetWriter.isaacCipher);
      var2.packetBuffer.writeShortLE(var1);
      var2.packetBuffer.writeInt(var0);
      Client.packetWriter.addNode(var2);
   }
}
