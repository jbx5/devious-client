import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ra")
@Implements("SongTask")
public abstract class SongTask {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	@Export("songTask")
	SongTask songTask;
	@ObfuscatedName("aj")
	String field4883;
	@ObfuscatedName("ai")
	String field4881;
	@ObfuscatedName("ay")
	boolean field4884;
	@ObfuscatedName("as")
	boolean field4885;

	@ObfuscatedSignature(
		descriptor = "(Lra;)V"
	)
	SongTask(SongTask var1) {
		this.songTask = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "343486624"
	)
	public abstract boolean vmethod8740();

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1816225167"
	)
	public boolean method8721() {
		return this.field4884;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "51"
	)
	public boolean method8732() {
		return this.field4885;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-561476633"
	)
	public String method8723() {
		return "Error in task: " + this.field4881 + ", Error message: " + this.field4883;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lra;",
		garbageValue = "1364477332"
	)
	public SongTask method8724() {
		return this.songTask;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "634133961"
	)
	void method8725(String var1) {
		this.field4884 = true;
		this.field4883 = var1;
	}
}
