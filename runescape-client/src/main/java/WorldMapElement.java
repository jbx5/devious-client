import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("fr")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lkq;")
    @Export("WorldMapElement_archive")
    public static AbstractArchive WorldMapElement_archive;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "[Lfr;")
    @Export("WorldMapElement_cached")
    public static WorldMapElement[] WorldMapElement_cached;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 1073841185)
    @Export("WorldMapElement_count")
    public static int WorldMapElement_count;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("WorldMapElement_cachedSprites")
    public static EvictingDualNodeHashTable WorldMapElement_cachedSprites;

    @ObfuscatedName("oo")
    @ObfuscatedSignature(descriptor = "[Ljz;")
    static Widget[] field1784;

    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = 229041495)
    @Export("objectId")
    public final int objectId;

    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = 429528577)
    @Export("sprite1")
    public int sprite1;

    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = 162961485)
    @Export("sprite2")
    int sprite2;

    @ObfuscatedName("w")
    @Export("name")
    public String name;

    @ObfuscatedName("v")
    @ObfuscatedGetter(intValue = 1943912081)
    public int field1767;

    @ObfuscatedName("a")
    @ObfuscatedGetter(intValue = 1737738457)
    @Export("textSize")
    public int textSize;

    @ObfuscatedName("u")
    public boolean field1769;

    @ObfuscatedName("h")
    public boolean field1773;

    @ObfuscatedName("q")
    @Export("menuActions")
    public String[] menuActions;

    @ObfuscatedName("x")
    @Export("menuTargetName")
    public String menuTargetName;

    @ObfuscatedName("p")
    int[] field1770;

    @ObfuscatedName("n")
    @ObfuscatedGetter(intValue = -1933187729)
    int field1762;

    @ObfuscatedName("m")
    @ObfuscatedGetter(intValue = -890732985)
    int field1775;

    @ObfuscatedName("d")
    @ObfuscatedGetter(intValue = 747675219)
    int field1776;

    @ObfuscatedName("j")
    @ObfuscatedGetter(intValue = -1606317103)
    int field1777;

    @ObfuscatedName("f")
    @ObfuscatedSignature(descriptor = "Lfh;")
    @Export("horizontalAlignment")
    public HorizontalAlignment horizontalAlignment;

    @ObfuscatedName("g")
    @ObfuscatedSignature(descriptor = "Lfo;")
    @Export("verticalAlignment")
    public VerticalAlignment verticalAlignment;

    @ObfuscatedName("t")
    int[] field1780;

    @ObfuscatedName("k")
    byte[] field1768;

    @ObfuscatedName("b")
    @ObfuscatedGetter(intValue = 90726405)
    @Export("category")
    public int category;

    static {
        WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256);
    }

    public WorldMapElement(int var1) {
        this.sprite1 = -1;
        this.sprite2 = -1;
        this.textSize = 0;
        this.field1769 = true;
        this.field1773 = false;
        this.menuActions = new String[5];
        this.field1762 = Integer.MAX_VALUE;
        this.field1775 = Integer.MAX_VALUE;
        this.field1776 = Integer.MIN_VALUE;
        this.field1777 = Integer.MIN_VALUE;
        this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
        this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
        this.category = -1;
        this.objectId = var1;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Lpi;B)V", garbageValue = "-72")
    @Export("decode")
    public void decode(Buffer var1) {
        while (true) {
            int var2 = var1.readUnsignedByte();
            if (var2 == 0) {
                return;
            }
            this.decodeNext(var1, var2);
        } 
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(Lpi;II)V", garbageValue = "-82268678")
    @Export("decodeNext")
    void decodeNext(Buffer var1, int var2) {
        if (var2 == 1) {
            this.sprite1 = var1.readNullableLargeSmart();
        } else if (var2 == 2) {
            this.sprite2 = var1.readNullableLargeSmart();
        } else if (var2 == 3) {
            this.name = var1.readStringCp1252NullTerminated();
        } else if (var2 == 4) {
            this.field1767 = var1.readMedium();
        } else if (var2 == 5) {
            var1.readMedium();
        } else if (var2 == 6) {
            this.textSize = var1.readUnsignedByte();
        } else {
            int var6;
            if (var2 == 7) {
                var6 = var1.readUnsignedByte();
                if ((var6 & 1) == 0) {
                    this.field1769 = false;
                }
                if ((var6 & 2) == 2) {
                    this.field1773 = true;
                }
            } else if (var2 == 8) {
                var1.readUnsignedByte();
            } else if ((var2 >= 10) && (var2 <= 14)) {
                this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
            } else if (var2 == 15) {
                var6 = var1.readUnsignedByte();
                this.field1770 = new int[var6 * 2];
                int var4;
                for (var4 = 0; var4 < (var6 * 2); ++var4) {
                    this.field1770[var4] = var1.readShort();
                }
                var1.readInt();
                var4 = var1.readUnsignedByte();
                this.field1780 = new int[var4];
                int var5;
                for (var5 = 0; var5 < this.field1780.length; ++var5) {
                    this.field1780[var5] = var1.readInt();
                }
                this.field1768 = new byte[var6];
                for (var5 = 0; var5 < var6; ++var5) {
                    this.field1768[var5] = var1.readByte();
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
                    HorizontalAlignment[] var3 = new HorizontalAlignment[]{ HorizontalAlignment.field1844, HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field1842 };
                    this.horizontalAlignment = ((HorizontalAlignment) (class140.findEnumerated(var3, var1.readUnsignedByte())));
                } else if (var2 == 30) {
                    this.verticalAlignment = ((VerticalAlignment) (class140.findEnumerated(KeyHandler.method322(), var1.readUnsignedByte())));
                }
            }
        }
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "90")
    public void method3164() {
        if (this.field1770 != null) {
            for (int var1 = 0; var1 < this.field1770.length; var1 += 2) {
                if (this.field1770[var1] < this.field1762) {
                    this.field1762 = this.field1770[var1];
                } else if (this.field1770[var1] > this.field1776) {
                    this.field1776 = this.field1770[var1];
                }
                if (this.field1770[var1 + 1] < this.field1775) {
                    this.field1775 = this.field1770[var1 + 1];
                } else if (this.field1770[var1 + 1] > this.field1777) {
                    this.field1777 = this.field1770[var1 + 1];
                }
            }
        }
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(ZI)Lpt;", garbageValue = "-723757733")
    @Export("getSpriteBool")
    public SpritePixels getSpriteBool(boolean var1) {
        int var2 = this.sprite1;
        return this.getSprite(var2);
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(II)Lpt;", garbageValue = "-2025134260")
    @Export("getSprite")
    SpritePixels getSprite(int var1) {
        if (var1 < 0) {
            return null;
        } else {
            SpritePixels var2 = ((SpritePixels) (WorldMapElement_cachedSprites.get(((long) (var1)))));
            if (var2 != null) {
                return var2;
            } else {
                var2 = class126.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
                if (var2 != null) {
                    WorldMapElement_cachedSprites.put(var2, ((long) (var1)));
                }
                return var2;
            }
        }
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1836205442")
    @Export("getObjectId")
    public int getObjectId() {
        return this.objectId;
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(IIIIB)V", garbageValue = "0")
    @Export("itemContainerSetItem")
    static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
        ItemContainer var4 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
        if (var4 == null) {
            var4 = new ItemContainer();
            ItemContainer.itemContainers.put(var4, ((long) (var0)));
        }
        if (var4.ids.length <= var1) {
            int[] var5 = new int[var1 + 1];
            int[] var6 = new int[var1 + 1];
            int var7;
            for (var7 = 0; var7 < var4.ids.length; ++var7) {
                var5[var7] = var4.ids[var7];
                var6[var7] = var4.quantities[var7];
            }
            for (var7 = var4.ids.length; var7 < var1; ++var7) {
                var5[var7] = -1;
                var6[var7] = 0;
            }
            var4.ids = var5;
            var4.quantities = var6;
        }
        var4.ids[var1] = var2;
        var4.quantities[var1] = var3;
    }
}