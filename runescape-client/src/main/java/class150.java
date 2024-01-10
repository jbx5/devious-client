import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public class class150 extends class143 {
	@ObfuscatedName("am")
	boolean field1677;
	@ObfuscatedName("ap")
	byte field1673;
	@ObfuscatedName("af")
	byte field1674;
	@ObfuscatedName("aj")
	byte field1672;
	@ObfuscatedName("aq")
	byte field1676;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfm;)V"
	)
	class150(class146 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-411371469"
	)
	void vmethod3531(Buffer var1) {
		this.field1677 = var1.readUnsignedByte() == 1;
		this.field1673 = var1.readByte();
		this.field1674 = var1.readByte();
		this.field1672 = var1.readByte();
		this.field1676 = var1.readByte();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "1048713263"
	)
	void vmethod3529(ClanSettings var1) {
		var1.allowGuests = this.field1677;
		var1.field1699 = this.field1673;
		var1.field1707 = this.field1674;
		var1.field1696 = this.field1672;
		var1.field1702 = this.field1676;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)[Ldl;",
		garbageValue = "84"
	)
	static AttackOption[] method3301() {
		return new AttackOption[]{AttackOption.field1331, AttackOption.AttackOption_hidden, AttackOption.AttackOption_alwaysRightClick, AttackOption.field1329, AttackOption.AttackOption_dependsOnCombatLevels};
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1514358172"
	)
	public static void method3304() {
		Iterator var0 = class319.musicSongs.iterator();

		while (var0.hasNext()) {
			MusicSong var1 = (MusicSong)var0.next();
			if (var1 != null) {
				var1.midiPcmStream.clear();
				var1.midiPcmStream.method6075();
				var1.midiPcmStream.setPcmStreamVolume(0);
				var1.midiPcmStream.field3499 = 0;
				class129.method3075(var1.musicTrackGroupId, var1.musicTrackFileId);
			}
		}

		class319.musicSongs.clear();
	}
}
