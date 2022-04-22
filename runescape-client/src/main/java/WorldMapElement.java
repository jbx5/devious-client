import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("tn")
	@ObfuscatedGetter(intValue = 
	-157770033)

	static int field1837;
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lln;")

	@Export("WorldMapElement_archive")
	static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"[Lfe;")

	@Export("WorldMapElement_cached")
	static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	225433591)

	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lig;")

	@Export("WorldMapElement_cachedSprites")
	public static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("bw")
	static String field1836;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	1299473343)

	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	2002473353)

	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	1967880505)

	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("l")
	@Export("name")
	public String name;
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 
	-713900129)

	public int field1819;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	-1130122781)

	@Export("textSize")
	public int textSize;
	@ObfuscatedName("p")
	public boolean field1822;
	@ObfuscatedName("w")
	public boolean field1823;
	@ObfuscatedName("k")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("d")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("m")
	int[] field1826;
	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 
	380033171)

	int field1827;
	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = 
	290055171)

	int field1818;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	1320968285)

	int field1829;
	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = 
	822364643)

	int field1816;
	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = 
	"Lfw;")

	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = 
	"Lfg;")

	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("j")
	int[] field1821;
	@ObfuscatedName("e")
	byte[] field1834;
	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 
	-504229365)

	@Export("category")
	public int category;
	static 
	{
		WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256);
	}

	WorldMapElement(int var1) {
		this.sprite1 = -1;
		this.sprite2 = -1;
		this.textSize = 0;
		this.field1822 = true;
		this.field1823 = false;
		this.menuActions = new String[5];
		this.field1827 = Integer.MAX_VALUE;
		this.field1818 = Integer.MAX_VALUE;
		this.field1829 = Integer.MIN_VALUE;
		this.field1816 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;B)V", garbageValue = 
	"2")

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
	"-633870320")

	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.sprite1 = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.sprite2 = var1.readNullableLargeSmart();
		} else if (var2 == 3) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.field1819 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) {
				var6 = var1.readUnsignedByte();
				if ((var6 & 1) == 0) {
					this.field1822 = false;
				}

				if ((var6 & 2) == 2) {
					this.field1823 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if ((var2 >= 10) && (var2 <= 14)) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var6 = var1.readUnsignedByte();
				this.field1826 = new int[var6 * 2];

				int var4;
				for (var4 = 0; var4 < (var6 * 2); ++var4) {
					this.field1826[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field1821 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field1821.length; ++var5) {
					this.field1821[var5] = var1.readInt();
				}

				this.field1834 = new byte[var6];

				for (var5 = 0; var5 < var6; ++var5) {
					this.field1834[var5] = var1.readByte();
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
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{ HorizontalAlignment.field1890, HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field1889 };
					this.horizontalAlignment = ((HorizontalAlignment) (MusicPatchPcmStream.findEnumerated(var3, var1.readUnsignedByte())));
				} else if (var2 == 30) {
					this.verticalAlignment = ((VerticalAlignment) (MusicPatchPcmStream.findEnumerated(class295.method5745(), var1.readUnsignedByte())));
				}
			}
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"13")

	void method3381() {
		if (this.field1826 != null) {
			for (int var1 = 0; var1 < this.field1826.length; var1 += 2) {
				if (this.field1826[var1] < this.field1827) {
					this.field1827 = this.field1826[var1];
				} else if (this.field1826[var1] > this.field1829) {
					this.field1829 = this.field1826[var1];
				}

				if (this.field1826[var1 + 1] < this.field1818) {
					this.field1818 = this.field1826[var1 + 1];
				} else if (this.field1826[var1 + 1] > this.field1816) {
					this.field1816 = this.field1826[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(ZI)Lqi;", garbageValue = 
	"39477486")

	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(II)Lqi;", garbageValue = 
	"-824891527")

	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			SpritePixels var2 = ((SpritePixels) (WorldMapElement_cachedSprites.get(((long) (var1)))));
			if (var2 != null) {
				return var2;
			} else {
				var2 = class6.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					WorldMapElement_cachedSprites.put(var2, ((long) (var1)));
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"1607536994")

	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;ZLjava/lang/String;ZI)V", garbageValue = 
	"1727118397")

	static void method3403(String var0, boolean var1, String var2, boolean var3) {
		if (var1) {
			if (((!var3) && Desktop.isDesktopSupported()) && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var5) {
				}
			}

			if (class29.field175.startsWith("win") && (!var3)) {
				PendingSpawn.method2165(var0, 0, "openjs");
				return;
			}

			if (class29.field175.startsWith("mac")) {
				PendingSpawn.method2165(var0, 1, var2);
				return;
			}

			PendingSpawn.method2165(var0, 2, "openjs");
		} else {
			PendingSpawn.method2165(var0, 3, "openjs");
		}

	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(CI)Z", garbageValue = 
	"-1481708201")

	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return (var0 >= '0') && (var0 <= '9');
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(IIIIIILhv;Lgv;B)V", garbageValue = 
	"-47")

	@Export("addObjects")
	static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (((!Client.isLowDetail) || ((Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0)) || ((Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0)) {
			if (var0 < Tiles.Tiles_minPlane) {
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = class146.getObjectDefinition(var3);
			int var9;
			int var10;
			if ((var4 != 1) && (var4 != 3)) {
				var9 = var8.sizeX;
				var10 = var8.sizeY;
			} else {
				var9 = var8.sizeY;
				var10 = var8.sizeX;
			}

			int var11;
			int var12;
			if ((var9 + var1) <= 104) {
				var11 = (var9 >> 1) + var1;
				var12 = ((var9 + 1) >> 1) + var1;
			} else {
				var11 = var1;
				var12 = var1 + 1;
			}

			int var13;
			int var14;
			if ((var10 + var2) <= 104) {
				var13 = (var10 >> 1) + var2;
				var14 = var2 + ((var10 + 1) >> 1);
			} else {
				var13 = var2;
				var14 = var2 + 1;
			}

			int[][] var15 = Tiles.Tiles_heights[var0];
			int var16 = (((var15[var11][var14] + var15[var12][var13]) + var15[var11][var13]) + var15[var12][var14]) >> 2;
			int var17 = (var1 << 7) + (var9 << 6);
			int var18 = (var2 << 7) + (var10 << 6);
			long var19 = GameObject.calculateTag(var1, var2, 2, var8.int1 == 0, var3);
			int var21 = var5 + (var4 << 6);
			if (var8.int3 == 1) {
				var21 += 256;
			}

			if (var8.hasSound()) {
				class360.method6589(var0, var1, var2, var8, var4);
			}

			Object var29;
			if (var5 == 22) {
				if ((((!Client.isLowDetail) || (var8.int1 != 0)) || (var8.interactType == 1)) || var8.boolean2) {
					if ((var8.animationId == (-1)) && (var8.transforms == null)) {
						var29 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
					}

					var6.newFloorDecoration(var0, var1, var2, var16, ((Renderable) (var29)), var19, var21);
					if ((var8.interactType == 1) && (var7 != null)) {
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else {
				int var28;
				if ((var5 != 10) && (var5 != 11)) {
					int[] var10000;
					if (var5 >= 12) {
						if ((var8.animationId == (-1)) && (var8.transforms == null)) {
							var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
						}

						var6.method4882(var0, var1, var2, var16, 1, 1, ((Renderable) (var29)), 0, var19, var21);
						if ((((var5 >= 12) && (var5 <= 17)) && (var5 != 13)) && (var0 > 0)) {
							var10000 = class420.field4545[var0][var1];
							var10000[var2] |= 2340;
						}

						if ((var8.interactType != 0) && (var7 != null)) {
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

					} else if (var5 == 0) {
						if ((var8.animationId == (-1)) && (var8.transforms == null)) {
							var29 = var8.getEntity(0, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
						}

						var6.newBoundaryObject(var0, var1, var2, var16, ((Renderable) (var29)), ((Renderable) (null)), Tiles.field990[var4], 0, var19, var21);
						if (var4 == 0) {
							if (var8.clipped) {
								class392.field4374[var0][var1][var2] = 50;
								class392.field4374[var0][var1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = class420.field4545[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) {
							if (var8.clipped) {
								class392.field4374[var0][var1][var2 + 1] = 50;
								class392.field4374[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = class420.field4545[var0][var1];
								var10000[1 + var2] |= 1170;
							}
						} else if (var4 == 2) {
							if (var8.clipped) {
								class392.field4374[var0][var1 + 1][var2] = 50;
								class392.field4374[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = class420.field4545[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) {
							if (var8.clipped) {
								class392.field4374[var0][var1][var2] = 50;
								class392.field4374[var0][var1 + 1][var2] = 50;
							}

							if (var8.modelClipped) {
								var10000 = class420.field4545[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if ((var8.interactType != 0) && (var7 != null)) {
							var7.method3872(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) {
							var6.method4748(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) {
						if ((var8.animationId == (-1)) && (var8.transforms == null)) {
							var29 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
						}

						var6.newBoundaryObject(var0, var1, var2, var16, ((Renderable) (var29)), ((Renderable) (null)), Tiles.field989[var4], 0, var19, var21);
						if (var8.clipped) {
							if (var4 == 0) {
								class392.field4374[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) {
								class392.field4374[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) {
								class392.field4374[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) {
								class392.field4374[var0][var1][var2] = 50;
							}
						}

						if ((var8.interactType != 0) && (var7 != null)) {
							var7.method3872(var1, var2, var5, var4, var8.boolean1);
						}

					} else {
						int var22;
						if (var5 == 2) {
							var22 = (var4 + 1) & 3;
							Object var24;
							Object var30;
							if ((var8.animationId == (-1)) && (var8.transforms == null)) {
								var30 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18);
								var24 = var8.getEntity(2, var22, var15, var17, var16, var18);
							} else {
								var30 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
								var24 = new DynamicObject(var3, 2, var22, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
							}

							var6.newBoundaryObject(var0, var1, var2, var16, ((Renderable) (var30)), ((Renderable) (var24)), Tiles.field990[var4], Tiles.field990[var22], var19, var21);
							if (var8.modelClipped) {
								if (var4 == 0) {
									var10000 = class420.field4545[var0][var1];
									var10000[var2] |= 585;
									var10000 = class420.field4545[var0][var1];
									var10000[1 + var2] |= 1170;
								} else if (var4 == 1) {
									var10000 = class420.field4545[var0][var1];
									var10000[1 + var2] |= 1170;
									var10000 = class420.field4545[var0][var1 + 1];
									var10000[var2] |= 585;
								} else if (var4 == 2) {
									var10000 = class420.field4545[var0][var1 + 1];
									var10000[var2] |= 585;
									var10000 = class420.field4545[var0][var1];
									var10000[var2] |= 1170;
								} else if (var4 == 3) {
									var10000 = class420.field4545[var0][var1];
									var10000[var2] |= 1170;
									var10000 = class420.field4545[var0][var1];
									var10000[var2] |= 585;
								}
							}

							if ((var8.interactType != 0) && (var7 != null)) {
								var7.method3872(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var6.method4748(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) {
							if ((var8.animationId == (-1)) && (var8.transforms == null)) {
								var29 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
							}

							var6.newBoundaryObject(var0, var1, var2, var16, ((Renderable) (var29)), ((Renderable) (null)), Tiles.field989[var4], 0, var19, var21);
							if (var8.clipped) {
								if (var4 == 0) {
									class392.field4374[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) {
									class392.field4374[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) {
									class392.field4374[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) {
									class392.field4374[var0][var1][var2] = 50;
								}
							}

							if ((var8.interactType != 0) && (var7 != null)) {
								var7.method3872(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) {
							if ((var8.animationId == (-1)) && (var8.transforms == null)) {
								var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
							}

							var6.method4882(var0, var1, var2, var16, 1, 1, ((Renderable) (var29)), 0, var19, var21);
							if ((var8.interactType != 0) && (var7 != null)) {
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var6.method4748(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) {
							if ((var8.animationId == (-1)) && (var8.transforms == null)) {
								var29 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
							}

							var6.newWallDecoration(var0, var1, var2, var16, ((Renderable) (var29)), ((Renderable) (null)), Tiles.field990[var4], 0, 0, 0, var19, var21);
						} else {
							long var23;
							Object var25;
							if (var5 == 5) {
								var22 = 16;
								var23 = var6.getBoundaryObjectTag(var0, var1, var2);
								if (0L != var23) {
									var22 = class146.getObjectDefinition(FileSystem.Entity_unpackID(var23)).int2;
								}

								if ((var8.animationId == (-1)) && (var8.transforms == null)) {
									var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
								}

								var6.newWallDecoration(var0, var1, var2, var16, ((Renderable) (var25)), ((Renderable) (null)), Tiles.field990[var4], 0, var22 * Tiles.field992[var4], var22 * Tiles.field993[var4], var19, var21);
							} else if (var5 == 6) {
								var22 = 8;
								var23 = var6.getBoundaryObjectTag(var0, var1, var2);
								if (var23 != 0L) {
									var22 = class146.getObjectDefinition(FileSystem.Entity_unpackID(var23)).int2 / 2;
								}

								if ((var8.animationId == (-1)) && (var8.transforms == null)) {
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
								}

								var6.newWallDecoration(var0, var1, var2, var16, ((Renderable) (var25)), ((Renderable) (null)), 256, var4, var22 * Tiles.field997[var4], var22 * Tiles.field995[var4], var19, var21);
							} else if (var5 == 7) {
								var28 = (var4 + 2) & 3;
								if ((var8.animationId == (-1)) && (var8.transforms == null)) {
									var29 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var29 = new DynamicObject(var3, 4, var28 + 4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
								}

								var6.newWallDecoration(var0, var1, var2, var16, ((Renderable) (var29)), ((Renderable) (null)), 256, var28, 0, 0, var19, var21);
							} else if (var5 == 8) {
								var22 = 8;
								var23 = var6.getBoundaryObjectTag(var0, var1, var2);
								if (0L != var23) {
									var22 = class146.getObjectDefinition(FileSystem.Entity_unpackID(var23)).int2 / 2;
								}

								int var27 = (var4 + 2) & 3;
								Object var26;
								if ((var8.animationId == (-1)) && (var8.transforms == null)) {
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
									var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
									var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
								}

								var6.newWallDecoration(var0, var1, var2, var16, ((Renderable) (var25)), ((Renderable) (var26)), 256, var4, var22 * Tiles.field997[var4], var22 * Tiles.field995[var4], var19, var21);
							}
						}
					}
				} else {
					if ((var8.animationId == (-1)) && (var8.transforms == null)) {
						var29 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
					}

					if (((var29 != null) && var6.method4882(var0, var1, var2, var16, var9, var10, ((Renderable) (var29)), var5 == 11 ? 256 : 0, var19, var21)) && var8.clipped) {
						var28 = 15;
						if (var29 instanceof Model) {
							var28 = ((Model) (var29)).method5014() / 4;
							if (var28 > 30) {
								var28 = 30;
							}
						}

						for (int var31 = 0; var31 <= var9; ++var31) {
							for (int var32 = 0; var32 <= var10; ++var32) {
								if (var28 > class392.field4374[var0][var31 + var1][var32 + var2]) {
									class392.field4374[var0][var31 + var1][var32 + var2] = ((byte) (var28));
								}
							}
						}
					}

					if ((var8.interactType != 0) && (var7 != null)) {
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				}
			}
		}
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;B)V", garbageValue = 
	"-62")

	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2986, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class425.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}