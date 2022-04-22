import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedList;





import net.runelite.rs.Reflection; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("gz")
	@ObfuscatedSignature(descriptor = 
	"Lof;")

	@Export("WorldMapElement_fonts")
	static Fonts WorldMapElement_fonts;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	406251203)

	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	-110127755)

	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	100910989)

	@Export("regionX")
	int regionX;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	654356143)

	@Export("regionY")
	int regionY;
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 
	27961817)

	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	-1476238073)

	@Export("planes")
	int planes;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	1237188241)

	@Export("groupId")
	int groupId;
	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 
	1492092043)

	@Export("fileId")
	int fileId;
	@ObfuscatedName("w")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("k")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("d")
	byte[][][] field2334;
	@ObfuscatedName("m")
	byte[][][] field2342;
	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"[[[[Lhl;")

	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("t")
	boolean field2346;
	@ObfuscatedName("g")
	boolean field2347;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field2346 = false;
		this.field2347 = false;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;I)V", garbageValue = 
	"169222990")

	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"95")

	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2346 && this.field2347;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = 
	"(Lln;B)V", garbageValue = 
	"-10")

	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field2346 = true;
				this.field2347 = true;
			}

		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"-50")

	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field2334 = null;
		this.field2342 = null;
		this.decorations = null;
		this.field2346 = false;
		this.field2347 = false;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = 
	"(IILpi;I)V", garbageValue = 
	"289519849")

	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method4319(var1, var2, var3, var4);
			} else {
				this.method4320(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(IILpi;II)V", garbageValue = 
	"-1881481092")

	void method4319(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = ((short) (var3.readUnsignedByte()));
		}

		this.floorUnderlayIds[0][var1][var2] = ((short) (var3.readUnsignedByte()));
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = 
	"(IILpi;IB)V", garbageValue = 
	"-121")

	void method4320(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1;
		boolean var6 = (var4 & 2) != 0;
		boolean var7 = (var4 & 4) != 0;
		this.floorUnderlayIds[0][var1][var2] = ((short) (var3.readUnsignedByte()));
		int var8;
		int var9;
		int var11;
		if (var6) {
			var8 = var3.readUnsignedByte();

			for (var9 = 0; var9 < var8; ++var9) {
				int var14 = var3.readUnsignedByte();
				if (var14 != 0) {
					this.floorOverlayIds[var9][var1][var2] = ((short) (var14));
					var11 = var3.readUnsignedByte();
					this.field2334[var9][var1][var2] = ((byte) (var11 >> 2));
					this.field2342[var9][var1][var2] = ((byte) (var11 & 3));
				}
			}
		}

		if (var7) {
			for (var8 = 0; var8 < var5; ++var8) {
				var9 = var3.readUnsignedByte();
				if (var9 != 0) {
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						int var12 = var3.readNullableLargeSmart();
						int var13 = var3.readUnsignedByte();
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"964749640")

	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-1283249810")

	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lln;Lln;Lln;Lji;I)Z", garbageValue = 
	"1083179858")

	public static boolean method4342(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, MidiPcmStream var3) {
		class273.musicPatchesArchive = var0;
		class273.musicSamplesArchive = var1;
		class273.soundEffectsArchive = var2;
		class273.midiPcmStream = var3;
		return true;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(I)Lca;", garbageValue = 
	"-1138182451")

	static ClientPreferences method4344() {
		AccessFile var0 = null;
		ClientPreferences var1 = new ClientPreferences();

		try {
			var0 = ModeWhere.getPreferencesFile("", Messages.field1305.name, false);
			byte[] var2 = new byte[((int) (var0.length()))];

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) {
				var4 = var0.read(var2, var3, var2.length - var3);
				if (var4 == (-1)) {
					throw new IOException();
				}
			}

			var1 = new ClientPreferences(new Buffer(var2));
		} catch (Exception var6) {
		}

		try {
			if (var0 != null) {
				var0.close();
			}
		} catch (Exception var5) {
		}

		return var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;II)V", garbageValue = 
	"-2052179879")

	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck();
		var2.size = var0.readUnsignedByte();
		var2.id = var0.readInt();
		var2.operations = new int[var2.size];
		var2.creationErrors = new int[var2.size];
		var2.fields = new Field[var2.size];
		var2.intReplaceValues = new int[var2.size];
		var2.methods = new Method[var2.size];
		var2.arguments = new byte[var2.size][][];

		for (int var3 = 0; var3 < var2.size; ++var3) {
			try {
				int var4 = var0.readUnsignedByte();
				String var5;
				String var6;
				int var7;
				if (((var4 != 0) && (var4 != 1)) && (var4 != 2)) {
					if ((var4 == 3) || (var4 == 4)) {
						var5 = var0.readStringCp1252NullTerminated();
						var6 = var0.readStringCp1252NullTerminated();
						var7 = var0.readUnsignedByte();
						String[] var8 = new String[var7];

						for (int var9 = 0; var9 < var7; ++var9) {
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated();
						byte[][] var10 = new byte[var7][];
						int var12;
						if (var4 == 3) {
							for (int var11 = 0; var11 < var7; ++var11) {
								var12 = var0.readInt();
								var10[var11] = new byte[var12];
								var0.readBytes(var10[var11], 0, var12);
							}
						}

						var2.operations[var3] = var4;
						Class[] var21 = new Class[var7];

						for (var12 = 0; var12 < var7; ++var12) {
							var21[var12] = class430.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = class430.loadClassFromDescriptor(var20);
						if (class430.loadClassFromDescriptor(var5).getClassLoader() == null) {
							throw new SecurityException();
						}

						Method[] var13 = class430.loadClassFromDescriptor(var5).getDeclaredMethods();
						Method[] var14 = var13;

						for (int var15 = 0; var15 < var14.length; ++var15) {
							Method var16 = var14[var15];
							if (Reflection.getMethodName(var16).equals(var6)) {
								Class[] var17 = Reflection.getParameterTypes(var16);
								if (var17.length == var21.length) {
									boolean var18 = true;

									for (int var19 = 0; var19 < var21.length; ++var19) {
										if (var17[var19] != var21[var19]) {
											var18 = false;
											break;
										}
									}

									if (var18 && (var22 == var16.getReturnType())) {
										var2.methods[var3] = var16;
									}
								}
							}
						}

						var2.arguments[var3] = var10;
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated();
					var6 = var0.readStringCp1252NullTerminated();
					var7 = 0;
					if (var4 == 1) {
						var7 = var0.readInt();
					}

					var2.operations[var3] = var4;
					var2.intReplaceValues[var3] = var7;
					if (class430.loadClassFromDescriptor(var5).getClassLoader() == null) {
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(class430.loadClassFromDescriptor(var5), var6);
				}
			} catch (ClassNotFoundException var24) {
				var2.creationErrors[var3] = -1;
			} catch (SecurityException var25) {
				var2.creationErrors[var3] = -2;
			} catch (NullPointerException var26) {
				var2.creationErrors[var3] = -3;
			} catch (Exception var27) {
				var2.creationErrors[var3] = -4;
			} catch (Throwable var28) {
				var2.creationErrors[var3] = -5;
			}
		}

		class54.reflectionChecks.addFirst(var2);
	}
}