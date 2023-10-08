import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("ac")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1989828526"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (class91.World_request == null) {
				class91.World_request = AbstractWorldMapIcon.urlRequester.request(new URL(class59.field450));
			} else if (class91.World_request.isDone()) {
				byte[] var0 = class91.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				UserComparator3.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = UserComparator3.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				class12.sortWorlds(UserComparator3.World_worlds, 0, UserComparator3.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				class91.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			class91.World_request = null;
		}

		return false;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)I",
		garbageValue = "-907105353"
	)
	static int method320(Widget var0) {
		if (var0.type != 11) {
			Interpreter.Interpreter_stringStack[class180.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize];
			Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var0.method6606(var1);
			return 1;
		}
	}
}
