import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lln;")

	@Export("HitSplatDefinition_archive")
	static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lig;")

	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"Lig;")

	@Export("HitSplatDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Lig;")

	@Export("HitSplatDefinition_cachedFonts")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 
	-78193355)

	@Export("fontId")
	int fontId;
	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 
	-867488021)

	@Export("textColor")
	public int textColor;
	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 
	566909491)

	public int field1998;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	2072278043)

	int field1999;
	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = 
	-367586383)

	int field2000;
	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 
	530891065)

	int field2001;
	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = 
	-1859926009)

	int field2002;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	621557545)

	public int field2003;
	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = 
	-1339697259)

	public int field2004;
	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 
	2090677099)

	public int field2005;
	@ObfuscatedName("y")
	String field2010;
	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 
	859094637)

	public int field2007;
	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 
	494157579)

	public int field2011;
	@ObfuscatedName("z")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	-608530201)

	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(intValue = 
	-1991065381)

	@Export("transformVarp")
	int transformVarp;
	static 
	{
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);
	}

	HitSplatDefinition() {
		this.fontId = -1;
		this.textColor = 16777215;
		this.field1998 = 70;
		this.field1999 = -1;
		this.field2000 = -1;
		this.field2001 = -1;
		this.field2002 = -1;
		this.field2003 = 0;
		this.field2004 = 0;
		this.field2005 = -1;
		this.field2010 = "";
		this.field2007 = -1;
		this.field2011 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;I)V", garbageValue = 
	"1833933416")

	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		} 
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;II)V", garbageValue = 
	"127877365")

	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field1999 = var1.readNullableLargeSmart();
		} else if (var2 == 4) {
			this.field2001 = var1.readNullableLargeSmart();
		} else if (var2 == 5) {
			this.field2000 = var1.readNullableLargeSmart();
		} else if (var2 == 6) {
			this.field2002 = var1.readNullableLargeSmart();
		} else if (var2 == 7) {
			this.field2003 = var1.readShort();
		} else if (var2 == 8) {
			this.field2010 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field1998 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field2004 = var1.readShort();
		} else if (var2 == 11) {
			this.field2005 = 0;
		} else if (var2 == 12) {
			this.field2007 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field2011 = var1.readShort();
		} else if (var2 == 14) {
			this.field2005 = var1.readUnsignedShort();
		} else if ((var2 == 17) || (var2 == 18)) {
			this.transformVarbit = var1.readUnsignedShort();
			if (this.transformVarbit == 65535) {
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort();
			if (this.transformVarp == 65535) {
				this.transformVarp = -1;
			}

			int var3 = -1;
			if (var2 == 18) {
				var3 = var1.readUnsignedShort();
				if (var3 == 65535) {
					var3 = -1;
				}
			}

			int var4 = var1.readUnsignedByte();
			this.transforms = new int[var4 + 2];

			for (int var5 = 0; var5 <= var4; ++var5) {
				this.transforms[var5] = var1.readUnsignedShort();
				if (this.transforms[var5] == 65535) {
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3;
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(I)Lgs;", garbageValue = 
	"-505226354")

	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != (-1)) {
			var1 = SecureRandomCallable.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != (-1)) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if ((var1 >= 0) && (var1 < (this.transforms.length - 1))) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != (-1) ? UserComparator3.method2602(var2) : null;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(II)Ljava/lang/String;", garbageValue = 
	"864399323")

	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2010;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = (var2.substring(0, var3) + ItemLayer.intToString(var1, false)) + var2.substring(var3 + 2);
		} 
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(I)Lqi;", garbageValue = 
	"872036041")

	public SpritePixels method3625() {
		if (this.field1999 < 0) {
			return null;
		} else {
			SpritePixels var1 = ((SpritePixels) (HitSplatDefinition_cachedSprites.get(((long) (this.field1999)))));
			if (var1 != null) {
				return var1;
			} else {
				var1 = class6.SpriteBuffer_getSprite(class282.field3261, this.field1999, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, ((long) (this.field1999)));
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(I)Lqi;", garbageValue = 
	"-1662028806")

	public SpritePixels method3640() {
		if (this.field2000 < 0) {
			return null;
		} else {
			SpritePixels var1 = ((SpritePixels) (HitSplatDefinition_cachedSprites.get(((long) (this.field2000)))));
			if (var1 != null) {
				return var1;
			} else {
				var1 = class6.SpriteBuffer_getSprite(class282.field3261, this.field2000, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, ((long) (this.field2000)));
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(I)Lqi;", garbageValue = 
	"927571164")

	public SpritePixels method3626() {
		if (this.field2001 < 0) {
			return null;
		} else {
			SpritePixels var1 = ((SpritePixels) (HitSplatDefinition_cachedSprites.get(((long) (this.field2001)))));
			if (var1 != null) {
				return var1;
			} else {
				var1 = class6.SpriteBuffer_getSprite(class282.field3261, this.field2001, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, ((long) (this.field2001)));
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(I)Lqi;", garbageValue = 
	"-1943622040")

	public SpritePixels method3627() {
		if (this.field2002 < 0) {
			return null;
		} else {
			SpritePixels var1 = ((SpritePixels) (HitSplatDefinition_cachedSprites.get(((long) (this.field2002)))));
			if (var1 != null) {
				return var1;
			} else {
				var1 = class6.SpriteBuffer_getSprite(class282.field3261, this.field2002, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, ((long) (this.field2002)));
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(I)Lmd;", garbageValue = 
	"-1180066279")

	@Export("getFont")
	public Font getFont() {
		if (this.fontId == (-1)) {
			return null;
		} else {
			Font var1 = ((Font) (HitSplatDefinition_cachedFonts.get(((long) (this.fontId)))));
			if (var1 != null) {
				return var1;
			} else {
				var1 = class163.method3322(class282.field3261, class349.HitSplatDefinition_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, ((long) (this.fontId)));
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(IB)I", garbageValue = 
	"12")

	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = ((ChatChannel) (Messages.Messages_channels.get(var0)));
		return var1 == null ? 0 : var1.size();
	}
}