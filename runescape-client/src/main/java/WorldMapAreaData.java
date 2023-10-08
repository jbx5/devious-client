import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lj")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("ay")
	HashSet field3100;
	@ObfuscatedName("as")
	HashSet field3098;
	@ObfuscatedName("aj")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Lul;Lul;IZZI)V",
		garbageValue = "-940833039"
	)
	void method5746(Buffer var1, Buffer var2, int var3, boolean var4, boolean var5) {
		this.method5266(var1, var3, var5);
		int var6 = var2.readUnsignedShort();
		this.field3100 = new HashSet(var6);

		int var7;
		for (var7 = 0; var7 < var6; ++var7) {
			WorldMapData_0 var8 = new WorldMapData_0();

			try {
				var8.init(var2);
			} catch (IllegalStateException var13) {
				continue;
			}

			this.field3100.add(var8);
		}

		var7 = var2.readUnsignedShort();
		this.field3098 = new HashSet(var7);

		for (int var11 = 0; var11 < var7; ++var11) {
			WorldMapData_1 var9 = new WorldMapData_1();

			try {
				var9.init(var2);
			} catch (IllegalStateException var12) {
				continue;
			}

			this.field3098.add(var9);
		}

		this.initIconsList(var2, var4);
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Lul;ZB)V",
		garbageValue = "0"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList();
		int var3 = var1.readUnsignedShort();

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = var1.readNullableLargeSmart();
			Coord var6 = new Coord(var1.readInt());
			boolean var7 = var1.readUnsignedByte() == 1;
			if (var2 || !var7) {
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null));
			}
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "1112250156"
	)
	static int method5744(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			Interpreter.Interpreter_intStackSize -= 2;
			Client.field791 = (short)class274.method5561(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
			if (Client.field791 <= 0) {
				Client.field791 = 256;
			}

			Client.field792 = (short)class274.method5561(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
			if (Client.field792 <= 0) {
				Client.field792 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			Interpreter.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			Interpreter.Interpreter_intStackSize -= 4;
			Client.field795 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			if (Client.field795 <= 0) {
				Client.field795 = 1;
			}

			Client.field662 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			if (Client.field662 <= 0) {
				Client.field662 = 32767;
			} else if (Client.field662 < Client.field795) {
				Client.field662 = Client.field795;
			}

			Client.field594 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			if (Client.field594 <= 0) {
				Client.field594 = 1;
			}

			Client.field798 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
			if (Client.field798 <= 0) {
				Client.field798 = 32767;
			} else if (Client.field798 < Client.field594) {
				Client.field798 = Client.field594;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				class53.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class398.method7349(Client.field791);
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class398.method7349(Client.field792);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class340.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class491.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}
}
