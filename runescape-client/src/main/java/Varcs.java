import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("bd")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("ev")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("ag")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("am")
	@Export("map")
	Map map;
	/** @deprecated */
	@Deprecated
	@ObfuscatedName("ax")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("aq")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = -669490880088972507L
	)
	long field1468;

	Varcs() {
		this.unwrittenChanges = false;
		int var1 = class53.archive2.getGroupFileCount(19);
		this.map = new HashMap();
		this.intsPersistence = new boolean[var1];

		int var2;
		for (var2 = 0; var2 < var1; ++var2) {
			VarcInt var3 = NPC.method2922(var2);
			this.intsPersistence[var2] = var3.persist;
		}

		var2 = 0;
		if (class53.archive2.method7484(15)) {
			var2 = class53.archive2.getGroupFileCount(15);
		}

		this.strings = new String[var2];
		this.read();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1732408259"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2);
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "54"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof Integer ? (Integer)var2 : -1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "2050667786"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-1"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof String ? (String)var2 : "";
	}

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "97"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2;
	}

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "103"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1909264951"
	)
	@Export("clearTransient")
	void clearTransient() {
		int var1;
		for (var1 = 0; var1 < this.intsPersistence.length; ++var1) {
			if (!this.intsPersistence[var1]) {
				this.map.remove(var1);
			}
		}

		for (var1 = 0; var1 < this.strings.length; ++var1) {
			this.strings[var1] = null;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lud;",
		garbageValue = "-403363419"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return class378.getPreferencesFile("2", class332.field3603.name, var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1535651707"
	)
	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true);

		try {
			int var2 = 3;
			int var3 = 0;
			Iterator var4 = this.map.entrySet().iterator();

			while (var4.hasNext()) {
				Entry var5 = (Entry)var4.next();
				int var6 = (Integer)var5.getKey();
				if (this.intsPersistence[var6]) {
					Object var7 = var5.getValue();
					var2 += 3;
					if (var7 instanceof Integer) {
						var2 += 4;
					} else if (var7 instanceof String) {
						var2 += class536.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3;
				}
			}

			Buffer var23 = new Buffer(var2);
			var23.writeByte(2);
			var23.writeShort(var3);
			Iterator var24 = this.map.entrySet().iterator();

			while (var24.hasNext()) {
				Entry var12 = (Entry)var24.next();
				int var13 = (Integer)var12.getKey();
				if (this.intsPersistence[var13]) {
					var23.writeShort(var13);
					Object var8 = var12.getValue();
					class537 var9 = class537.method9758(var8.getClass());
					var23.writeByte(var9.field5334);
					class537.method9759(var8, var23);
				}
			}

			var1.write(var23.array, 0, var23.offset);
		} catch (Exception var21) {
		} finally {
			try {
				var1.close();
			} catch (Exception var20) {
			}

		}

		this.unwrittenChanges = false;
		this.field1468 = WorldMapElement.method3843();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1998721527"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false);

		label242: {
			try {
				byte[] var2 = new byte[(int)var1.length()];

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) {
					var4 = var1.read(var2, var3, var2.length - var3);
					if (var4 == -1) {
						throw new EOFException();
					}
				}

				Buffer var14 = new Buffer(var2);
				if (var14.array.length - var14.offset < 1) {
					return;
				}

				int var15 = var14.readUnsignedByte();
				if (var15 >= 0 && var15 <= 2) {
					int var7;
					int var8;
					int var9;
					int var16;
					if (var15 >= 2) {
						var16 = var14.readUnsignedShort();
						var7 = 0;

						while (true) {
							if (var7 >= var16) {
								break label242;
							}

							var8 = var14.readUnsignedShort();
							var9 = var14.readUnsignedByte();
							class537 var10 = (class537)ArchiveDiskAction.findEnumerated(class537.method9774(), var9);
							Object var11 = var10.method9761(var14);
							if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) {
								this.map.put(var8, var11);
							}

							++var7;
						}
					} else {
						var16 = var14.readUnsignedShort();

						for (var7 = 0; var7 < var16; ++var7) {
							var8 = var14.readUnsignedShort();
							var9 = var14.readInt();
							if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) {
								this.map.put(var8, var9);
							}
						}

						var7 = var14.readUnsignedShort();
						var8 = 0;

						while (true) {
							if (var8 >= var7) {
								break label242;
							}

							var14.readUnsignedShort();
							var14.readStringCp1252NullTerminated();
							++var8;
						}
					}
				}
			} catch (Exception var25) {
				break label242;
			} finally {
				try {
					var1.close();
				} catch (Exception var24) {
				}

			}

			return;
		}

		this.unwrittenChanges = false;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "981958628"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1468 < WorldMapElement.method3843() - 60000L) {
			this.write();
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "14"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Loj;",
		garbageValue = "2076488859"
	)
	public static GameBuild method3039(int var0) {
		GameBuild[] var1 = new GameBuild[]{GameBuild.RC, GameBuild.WIP, GameBuild.LIVE, GameBuild.BUILDLIVE};
		GameBuild[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			GameBuild var4 = var2[var3];
			if (var0 == var4.buildId) {
				return var4;
			}
		}

		return null;
	}
}
