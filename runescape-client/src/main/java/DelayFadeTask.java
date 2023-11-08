import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pt")
@Implements("DelayFadeTask")
public class DelayFadeTask extends SongTask {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lbz;"
	)
	@Export("soundSystem")
	public static SoundSystem soundSystem;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 6821196167292438109L
	)
	long field4544;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1192126365
	)
	int field4543;

	@ObfuscatedSignature(
		descriptor = "(Lql;I)V"
	)
	public DelayFadeTask(SongTask var1, int var2) {
		super(var1);
		this.field4543 = var2;
		super.field4552 = "DelayFadeTask";
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-799935345"
	)
	public boolean vmethod7858() {
		if (this.field4544 < (long)this.field4543) {
			++this.field4544;
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-52"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Canvas.method332();
		if (class20.friendsChat != null) {
			class20.friendsChat.invalidateIgnoreds();
		}

	}
}
