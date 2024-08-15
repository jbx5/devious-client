import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uy")
public class class535 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	public static final class535 field5299;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	public static final class535 field5293;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	public static final class535 field5292;
	@ObfuscatedName("pv")
	@ObfuscatedGetter(
		intValue = -1043356469
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -201811719
	)
	public final int field5295;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 936432723
	)
	public final int field5294;
	@ObfuscatedName("ao")
	public final Class field5297;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lux;"
	)
	final class531 field5298;

	static {
		field5299 = new class535(0, 0, Integer.class, new class532());
		field5293 = new class535(1, 1, Long.class, new class534());
		field5292 = new class535(2, 2, String.class, new class536());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lux;)V"
	)
	class535(int var1, int var2, Class var3, class531 var4) {
		this.field5295 = var1;
		this.field5294 = var2;
		this.field5297 = var3;
		this.field5298 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5294;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lvg;B)Ljava/lang/Object;",
		garbageValue = "-28"
	)
	public Object method9461(Buffer var1) {
		return this.field5298.vmethod9476(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;S)V",
		garbageValue = "-24047"
	)
	public static void method9457(Applet var0, String var1) {
		class31.field138 = var0;
		if (var1 != null) {
			class31.field143 = var1;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ldc;III)V",
		garbageValue = "466750217"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		if (class143.isWorldMapEvent(var0.type)) {
			class269.worldMapEvent = (WorldMapEvent)var3[0];
			WorldMapElement var6 = class104.WorldMapElement_get(class269.worldMapEvent.mapElement);
			var4 = class59.getWorldMapScript(var0.type, var6.objectId, var6.category);
		} else {
			int var5 = (Integer)var3[0];
			var4 = ScriptEvent.getScript(var5);
		}

		if (var4 != null) {
			MouseHandler.runScriptLogic(var0, var4, var1, var2);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1700364154"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0);
		if (var4 == null) {
			var4 = new ChatChannel();
			Messages.Messages_channels.put(var0, var4);
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3);
		Messages.Messages_hashTable.put(var5, (long)var5.count);
		Messages.Messages_queue.add(var5);
		Client.chatCycle = Client.cycleCntr;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)[Luy;",
		garbageValue = "6"
	)
	public static class535[] method9458() {
		return new class535[]{field5293, field5299, field5292};
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lvg;I)V",
		garbageValue = "30354583"
	)
	public static void method9448(Object var0, Buffer var1) {
		class531 var2 = method9449(var0.getClass());
		var2.vmethod9472(var0, var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Lux;",
		garbageValue = "2131594837"
	)
	static class531 method9449(Class var0) {
		class535[] var2 = method9458();
		int var3 = 0;

		class535 var1;
		while (true) {
			if (var3 >= var2.length) {
				var1 = null;
				break;
			}

			class535 var4 = var2[var3];
			if (var4.field5297 == var0) {
				var1 = var4;
				break;
			}

			++var3;
		}

		if (var1 == null) {
			throw new IllegalArgumentException();
		} else {
			return var1.field5298;
		}
	}

	@ObfuscatedName("ae")
	static int method9466(long var0) {
		return (int)(var0 >>> 49 & 2047L);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-1463323352"
	)
	static final int method9446(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1;
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1326717592"
	)
	static void method9464() {
		class532.updateLoginIndex(24);
		class130.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
	}
}
