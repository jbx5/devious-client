import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("re")
@Implements("SongTask")
public abstract class SongTask {
	@ObfuscatedName("aq")
	static int[][][] field4795;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	@Export("songTask")
	SongTask songTask;
	@ObfuscatedName("az")
	String field4794;
	@ObfuscatedName("af")
	String field4793;
	@ObfuscatedName("aa")
	boolean field4796;
	@ObfuscatedName("at")
	boolean field4798;

	@ObfuscatedSignature(
		descriptor = "(Lre;)V"
	)
	SongTask(SongTask var1) {
		this.songTask = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1230726323"
	)
	public abstract boolean vmethod8329();

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-75"
	)
	public boolean method8301() {
		return this.field4796;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	public boolean method8302() {
		return this.field4798;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1262267093"
	)
	public String method8319() {
		return "Error in task: " + this.field4793 + ", Error message: " + this.field4794;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Lre;",
		garbageValue = "55"
	)
	public SongTask method8304() {
		return this.songTask;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-280657566"
	)
	void method8305(String var1) {
		this.field4796 = true;
		this.field4794 = var1;
	}
}
