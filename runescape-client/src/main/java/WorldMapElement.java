import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
   @ObfuscatedName("vm")
   @ObfuscatedSignature(
      descriptor = "Lbt;"
   )
   @Export("friendSystem")
   public static FriendSystem friendSystem;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("WorldMapElement_archive")
   static AbstractArchive WorldMapElement_archive;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lja;"
   )
   @Export("WorldMapElement_cachedSprites")
   static EvictingDualNodeHashTable WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256);
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 266154871
   )
   @Export("objectId")
   public final int objectId;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1498280247
   )
   @Export("sprite1")
   public int sprite1 = -1;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 710902019
   )
   @Export("sprite2")
   int sprite2 = -1;
   @ObfuscatedName("n")
   @Export("name")
   public String name;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1564544571
   )
   public int field1940;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 1363364683
   )
   @Export("textSize")
   public int textSize = 0;
   @ObfuscatedName("r")
   public boolean field1942 = true;
   @ObfuscatedName("b")
   public boolean field1953 = false;
   @ObfuscatedName("m")
   @Export("menuActions")
   public String[] menuActions = new String[5];
   @ObfuscatedName("t")
   @Export("menuTargetName")
   public String menuTargetName;
   @ObfuscatedName("h")
   int[] field1946;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1294446309
   )
   int field1947 = Integer.MAX_VALUE;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -422315681
   )
   int field1948 = Integer.MAX_VALUE;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -598155535
   )
   int field1939 = Integer.MIN_VALUE;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1776593143
   )
   int field1950 = Integer.MIN_VALUE;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lgw;"
   )
   @Export("horizontalAlignment")
   public HorizontalAlignment horizontalAlignment;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Lgd;"
   )
   @Export("verticalAlignment")
   public VerticalAlignment verticalAlignment;
   @ObfuscatedName("d")
   int[] field1954;
   @ObfuscatedName("e")
   byte[] field1956;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1961277303
   )
   @Export("category")
   public int category;

   WorldMapElement(int var1) {
      this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
      this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
      this.category = -1;
      this.objectId = var1;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lrd;I)V",
      garbageValue = "-1209033784"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Lrd;II)V",
      garbageValue = "1241782966"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         this.sprite1 = var1.readNullableLargeSmart();
      } else if (var2 == 2) {
         this.sprite2 = var1.readNullableLargeSmart();
      } else if (var2 == 3) {
         this.name = var1.readStringCp1252NullTerminated();
      } else if (var2 == 4) {
         this.field1940 = var1.readMedium();
      } else if (var2 == 5) {
         var1.readMedium();
      } else if (var2 == 6) {
         this.textSize = var1.readUnsignedByte();
      } else {
         int var6;
         if (var2 == 7) {
            var6 = var1.readUnsignedByte();
            if ((var6 & 1) == 0) {
               this.field1942 = false;
            }

            if ((var6 & 2) == 2) {
               this.field1953 = true;
            }
         } else if (var2 == 8) {
            var1.readUnsignedByte();
         } else if (var2 >= 10 && var2 <= 14) {
            this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
         } else if (var2 == 15) {
            var6 = var1.readUnsignedByte();
            this.field1946 = new int[var6 * 2];

            int var4;
            for(var4 = 0; var4 < var6 * 2; ++var4) {
               this.field1946[var4] = var1.readShort();
            }

            var1.readInt();
            var4 = var1.readUnsignedByte();
            this.field1954 = new int[var4];

            int var5;
            for(var5 = 0; var5 < this.field1954.length; ++var5) {
               this.field1954[var5] = var1.readInt();
            }

            this.field1956 = new byte[var6];

            for(var5 = 0; var5 < var6; ++var5) {
               this.field1956[var5] = var1.readByte();
            }
         } else if (var2 != 16) {
            if (var2 == 17) {
               this.menuTargetName = var1.readStringCp1252NullTerminated();
            } else if (var2 == 18) {
               var1.readNullableLargeSmart();
            } else if (var2 == 19) {
               this.category = var1.readUnsignedShort();
            } else if (var2 == 21) {
               var1.readInt();
            } else if (var2 == 22) {
               var1.readInt();
            } else if (var2 == 23) {
               var1.readUnsignedByte();
               var1.readUnsignedByte();
               var1.readUnsignedByte();
            } else if (var2 == 24) {
               var1.readShort();
               var1.readShort();
            } else if (var2 == 25) {
               var1.readNullableLargeSmart();
            } else if (var2 == 28) {
               var1.readUnsignedByte();
            } else if (var2 == 29) {
               HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.field2015, HorizontalAlignment.field2012, HorizontalAlignment.HorizontalAlignment_centered};
               this.horizontalAlignment = (HorizontalAlignment)class4.findEnumerated(var3, var1.readUnsignedByte());
            } else if (var2 == 30) {
               VerticalAlignment[] var7 = new VerticalAlignment[]{VerticalAlignment.field2078, VerticalAlignment.field2074, VerticalAlignment.VerticalAlignment_centered};
               this.verticalAlignment = (VerticalAlignment)class4.findEnumerated(var7, var1.readUnsignedByte());
            }
         }
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-142199298"
   )
   void method3602() {
      if (this.field1946 != null) {
         for(int var1 = 0; var1 < this.field1946.length; var1 += 2) {
            if (this.field1946[var1] < this.field1947) {
               this.field1947 = this.field1946[var1];
            } else if (this.field1946[var1] > this.field1939) {
               this.field1939 = this.field1946[var1];
            }

            if (this.field1946[var1 + 1] < this.field1948) {
               this.field1948 = this.field1946[var1 + 1];
            } else if (this.field1946[var1 + 1] > this.field1950) {
               this.field1950 = this.field1946[var1 + 1];
            }
         }
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(ZI)Lrs;",
      garbageValue = "-1625143734"
   )
   @Export("getSpriteBool")
   public SpritePixels getSpriteBool(boolean var1) {
      int var2 = this.sprite1;
      return this.getSprite(var2);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(IB)Lrs;",
      garbageValue = "-22"
   )
   @Export("getSprite")
   SpritePixels getSprite(int var1) {
      if (var1 < 0) {
         return null;
      } else {
         SpritePixels var2 = (SpritePixels)WorldMapElement_cachedSprites.get((long)var1);
         if (var2 != null) {
            return var2;
         } else {
            var2 = BZip2State.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
            if (var2 != null) {
               WorldMapElement_cachedSprites.put(var2, (long)var1);
            }

            return var2;
         }
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1433286194"
   )
   @Export("getObjectId")
   public int getObjectId() {
      return this.objectId;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "-59"
   )
   public static int method3630(int var0) {
      return class140.method3158(ViewportMouse.ViewportMouse_entityTags[var0]);
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1741493594"
   )
   public static void method3612() {
      FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1532551681"
   )
   static final void method3631(String var0) {
      PacketBufferNode var1 = Renderable.getPacketBufferNode(ClientPacket.field3133, Client.packetWriter.isaacCipher);
      var1.packetBuffer.writeByte(class96.stringCp1252NullTerminatedByteSize(var0));
      var1.packetBuffer.writeStringCp1252NullTerminated(var0);
      Client.packetWriter.addNode(var1);
   }
}
