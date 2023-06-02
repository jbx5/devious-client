import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class154 extends class158 {
   @ObfuscatedName("at")
   String field1713;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1350197681
   )
   int field1712;
   @ObfuscatedName("av")
   byte field1714;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lgh;"
   )
   final class159 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lgh;)V"
   )
   class154(class159 var1) {
      this.this$0 = var1;
      this.field1713 = null;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltz;I)V",
      garbageValue = "-986564571"
   )
   void vmethod3370(Buffer var1) {
      if (var1.readUnsignedByte() != 255) {
         --var1.offset;
         var1.readLong();
      }

      this.field1713 = var1.readStringCp1252NullTerminatedOrNull();
      this.field1712 = var1.readUnsignedShort();
      this.field1714 = var1.readByte();
      var1.readLong();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lgv;I)V",
      garbageValue = "1284013379"
   )
   void vmethod3371(ClanChannel var1) {
      ClanChannelMember var2 = new ClanChannelMember();
      var2.username = new Username(this.field1713);
      var2.world = this.field1712;
      var2.rank = this.field1714;
      var1.addMember(var2);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IS)Lhv;",
      garbageValue = "11573"
   )
   @Export("KitDefinition_get")
   public static KitDefinition KitDefinition_get(int var0) {
      KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0);
         var1 = new KitDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         KitDefinition.KitDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ltz;[IS)[Ljava/lang/Object;",
      garbageValue = "180"
   )
   static Object[] method3274(Buffer var0, int[] var1) {
      int var2 = var0.readUShortSmart();
      Object[] var3 = new Object[var1.length * var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         for(int var5 = 0; var5 < var1.length; ++var5) {
            int var6 = var1.length * var4 + var5;
            class490 var7 = WorldMapRectangle.method5458(var1[var5]);
            var3[var6] = var7.method8758(var0);
         }
      }

      return var3;
   }
}
