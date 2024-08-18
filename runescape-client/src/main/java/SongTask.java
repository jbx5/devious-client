import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rm")
@Implements("SongTask")
public abstract class SongTask {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	@Export("songTask")
	SongTask songTask;
	@ObfuscatedName("au")
	String field4791;
	@ObfuscatedName("ax")
	String field4796;
	@ObfuscatedName("ao")
	boolean field4793;
	@ObfuscatedName("am")
	boolean field4792;

	@ObfuscatedSignature(
		descriptor = "(Lrm;)V"
	)
	SongTask(SongTask var1) {
		this.songTask = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "734274820"
	)
	public abstract boolean vmethod8342();

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "16106"
	)
	public boolean method8321() {
		return this.field4793;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1423401620"
	)
	public boolean method8322() {
		return this.field4792;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1316397400"
	)
	public String method8326() {
		return "Error in task: " + this.field4796 + ", Error message: " + this.field4791;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lrm;",
		garbageValue = "-826738891"
	)
	public SongTask method8328() {
		return this.songTask;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-107"
	)
	void method8325(String var1) {
		this.field4793 = true;
		this.field4791 = var1;
	}
}
