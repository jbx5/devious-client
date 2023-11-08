import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ql")
@Implements("SongTask")
public abstract class SongTask {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("songTask")
	SongTask songTask;
	@ObfuscatedName("ao")
	String field4551;
	@ObfuscatedName("ab")
	String field4552;
	@ObfuscatedName("au")
	boolean field4557;
	@ObfuscatedName("aa")
	boolean field4555;

	@ObfuscatedSignature(
		descriptor = "(Lql;)V"
	)
	SongTask(SongTask var1) {
		this.songTask = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-799935345"
	)
	public abstract boolean vmethod7858();

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1285191143"
	)
	public boolean method7842() {
		return this.field4557;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	public boolean method7837() {
		return this.field4555;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1733616113"
	)
	public String method7834() {
		return "Error in task: " + this.field4552 + ", Error message: " + this.field4551;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lql;",
		garbageValue = "1680402489"
	)
	public SongTask method7839() {
		return this.songTask;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "2"
	)
	void method7840(String var1) {
		this.field4557 = true;
		this.field4551 = var1;
	}
}
