import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public class class163 extends class148 {
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "[Lvc;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 1161798066471138831L
	)
	long field1778;
	@ObfuscatedName("ay")
	String field1779;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1308806743
	)
	int field1777;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	final class151 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfy;)V"
	)
	class163(class151 var1) {
		this.this$0 = var1;
		this.field1778 = -1L;
		this.field1779 = null;
		this.field1777 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "-1070155477"
	)
	void vmethod3619(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1778 = var1.readLong();
		}

		this.field1779 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1777 = var1.readUnsignedShort();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "1070728869"
	)
	void vmethod3621(ClanSettings var1) {
		var1.method3442(this.field1778, this.field1779, this.field1777);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;I)V",
		garbageValue = "-270324760"
	)
	static void method3535(File var0) {
		HttpRequestTask.FileSystem_cacheDir = var0;
		if (!HttpRequestTask.FileSystem_cacheDir.exists()) {
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true;
		}
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-5"
	)
	static final void method3528(int var0) {
		int[] var1 = class91.sceneMinimapSprite.pixels;
		int var2 = var1.length;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			var1[var3] = 0;
		}

		int var4;
		int var5;
		for (var3 = 1; var3 < 103; ++var3) {
			var4 = (103 - var3) * 2048 + 24628;

			for (var5 = 1; var5 < 103; ++var5) {
				if ((ConcurrentMidiTask.topLevelWorldView.tileSettings[var0][var5][var3] & 24) == 0) {
					ConcurrentMidiTask.topLevelWorldView.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
				}

				if (var0 < 3 && (ConcurrentMidiTask.topLevelWorldView.tileSettings[var0 + 1][var5][var3] & 8) != 0) {
					ConcurrentMidiTask.topLevelWorldView.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
				}

				var4 += 4;
			}
		}

		var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
		var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
		class91.sceneMinimapSprite.setRaster();

		int var6;
		for (var5 = 1; var5 < 103; ++var5) {
			for (var6 = 1; var6 < 103; ++var6) {
				if ((ConcurrentMidiTask.topLevelWorldView.tileSettings[var0][var6][var5] & 24) == 0) {
					EnumComposition.drawObject(var0, var6, var5, var3, var4);
				}

				if (var0 < 3 && (ConcurrentMidiTask.topLevelWorldView.tileSettings[var0 + 1][var6][var5] & 8) != 0) {
					EnumComposition.drawObject(var0 + 1, var6, var5, var3, var4);
				}
			}
		}

		Client.mapIconCount = 0;

		for (var5 = 0; var5 < 104; ++var5) {
			for (var6 = 0; var6 < 104; ++var6) {
				long var7 = ConcurrentMidiTask.topLevelWorldView.scene.getFloorDecorationTag(ConcurrentMidiTask.topLevelWorldView.plane, var5, var6);
				if (0L != var7) {
					int var9 = class513.Entity_unpackID(var7);
					int var10 = class222.getObjectDefinition(var9).mapIconId;
					if (var10 >= 0 && class104.WorldMapElement_get(var10).field2474) {
						Client.mapIcons[Client.mapIconCount] = class104.WorldMapElement_get(var10).getSpriteBool(false);
						Client.mapIconXs[Client.mapIconCount] = var5;
						Client.mapIconYs[Client.mapIconCount] = var6;
						++Client.mapIconCount;
					}
				}
			}
		}

		class299.rasterProvider.apply();
	}
}
