import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ri")
@Implements("SongTask")
public abstract class SongTask {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	@Export("songTask")
	SongTask songTask;
	@ObfuscatedName("am")
	String field4842;
	@ObfuscatedName("ax")
	String field4843;
	@ObfuscatedName("aq")
	boolean field4845;
	@ObfuscatedName("af")
	boolean field4841;

	@ObfuscatedSignature(
		descriptor = "(Lri;)V"
	)
	SongTask(SongTask var1) {
		this.songTask = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1411718299"
	)
	public abstract boolean vmethod8618();

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "4118"
	)
	public boolean method8599() {
		return this.field4845;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "42"
	)
	public boolean method8600() {
		return this.field4841;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "90"
	)
	public String method8601() {
		return "Error in task: " + this.field4843 + ", Error message: " + this.field4842;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lri;",
		garbageValue = "1819465791"
	)
	public SongTask method8597() {
		return this.songTask;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-65735155"
	)
	void method8609(String var1) {
		this.field4845 = true;
		this.field4842 = var1;
	}
}
