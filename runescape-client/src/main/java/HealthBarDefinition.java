import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("HealthBarDefinition_archive")
   public static AbstractArchive HealthBarDefinition_archive;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   public static AbstractArchive field1960;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   @Export("HealthBarDefinition_cached")
   public static EvictingDualNodeHashTable HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   @Export("HitSplatDefinition_cachedSprites")
   static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -431598869
   )
   public int field1959;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 520914669
   )
   @Export("int1")
   public int int1 = 255;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1525821745
   )
   @Export("int2")
   public int int2 = 255;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -471494485
   )
   @Export("int3")
   public int int3 = -1;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 294055185
   )
   public int field1971 = 1;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -407931959
   )
   @Export("int5")
   public int int5 = 70;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1930644535
   )
   @Export("frontSpriteID")
   int frontSpriteID = -1;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1451871987
   )
   @Export("backSpriteID")
   int backSpriteID = -1;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 279738407
   )
   @Export("width")
   public int width = 30;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -2064168457
   )
   @Export("widthPadding")
   public int widthPadding = 0;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lsg;B)V",
      garbageValue = "39"
   )
   @Export("decode")
   public void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lsg;IB)V",
      garbageValue = "-52"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         var1.readUnsignedShort();
      } else if (var2 == 2) {
         this.int1 = var1.readUnsignedByte();
      } else if (var2 == 3) {
         this.int2 = var1.readUnsignedByte();
      } else if (var2 == 4) {
         this.int3 = 0;
      } else if (var2 == 5) {
         this.int5 = var1.readUnsignedShort();
      } else if (var2 == 6) {
         var1.readUnsignedByte();
      } else if (var2 == 7) {
         this.frontSpriteID = var1.readNullableLargeSmart();
      } else if (var2 == 8) {
         this.backSpriteID = var1.readNullableLargeSmart();
      } else if (var2 == 11) {
         this.int3 = var1.readUnsignedShort();
      } else if (var2 == 14) {
         this.width = var1.readUnsignedByte();
      } else if (var2 == 15) {
         this.widthPadding = var1.readUnsignedByte();
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(B)Ltq;",
      garbageValue = "9"
   )
   @Export("getFrontSprite")
   public SpritePixels getFrontSprite() {
      if (this.frontSpriteID < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.frontSpriteID);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class484.SpriteBuffer_getSprite(field1960, this.frontSpriteID, 0);
            if (var1 != null) {
               HitSplatDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)Ltq;",
      garbageValue = "-540655090"
   )
   public SpritePixels method3713() {
      if (this.backSpriteID < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.backSpriteID);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class484.SpriteBuffer_getSprite(field1960, this.backSpriteID, 0);
            if (var1 != null) {
               HitSplatDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;ZI)[B",
      garbageValue = "2040236777"
   )
   public static byte[] method3729(Object var0, boolean var1) {
      if (var0 == null) {
         return null;
      } else if (var0 instanceof byte[]) {
         byte[] var6 = (byte[])((byte[])var0);
         if (var1) {
            int var4 = var6.length;
            byte[] var5 = new byte[var4];
            System.arraycopy(var6, 0, var5, 0, var4);
            return var5;
         } else {
            return var6;
         }
      } else if (var0 instanceof AbstractByteArrayCopier) {
         AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
         return var2.get();
      } else {
         throw new IllegalArgumentException();
      }
   }
}
