import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qe")
@Implements("SongTask")
public abstract class SongTask {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("songTask")
	SongTask songTask;
	@ObfuscatedName("ai")
	String field4626;
	@ObfuscatedName("ar")
	String field4627;
	@ObfuscatedName("as")
	boolean field4629;
	@ObfuscatedName("aa")
	boolean field4630;

	@ObfuscatedSignature(
		descriptor = "(Lqe;)V"
	)
	SongTask(SongTask var1) {
		this.songTask = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2024199564"
	)
	public abstract boolean vmethod8043();

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	public boolean method8013() {
		return this.field4629;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "105"
	)
	public boolean method8038() {
		return this.field4630;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "404483720"
	)
	public String method8015() {
		return "Error in task: " + this.field4627 + ", Error message: " + this.field4626;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lqe;",
		garbageValue = "1254351439"
	)
	public SongTask method8016() {
		return this.songTask;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "665644567"
	)
	void method8017(String var1) {
		this.field4629 = true;
		this.field4626 = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lda;III)V",
		garbageValue = "-1262684689"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		if (WorldMapLabelSize.isWorldMapEvent(var0.type)) {
			class429.worldMapEvent = (WorldMapEvent)var3[0];
			WorldMapElement var6 = class139.WorldMapElement_get(class429.worldMapEvent.mapElement);
			var4 = class223.getWorldMapScript(var0.type, var6.objectId, var6.category);
		} else {
			int var5 = (Integer)var3[0];
			var4 = GrandExchangeOfferOwnWorldComparator.getScript(var5);
		}

		if (var4 != null) {
			PacketWriter.runScriptLogic(var0, var4, var1, var2);
		}

	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(I)Lsg;",
		garbageValue = "1413435483"
	)
	@Export("getPlatformInfo")
	static PlatformInfo getPlatformInfo() {
		return class31.platformInfo;
	}
}
