import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.util.Date;
import net.runelite.mapping.Export;
@ObfuscatedName("fc")
public class class161 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "[Lqe;")
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;

	@ObfuscatedName("v")
	public String field1755;

	@ObfuscatedName("c")
	public float[] field1752;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 757674837)
	public int field1758;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 1022851267)
	public int field1757;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = -1087448423)
	public int field1759;

	@ObfuscatedSignature(descriptor = "Leu;")
	final class155 this$0;

	@ObfuscatedSignature(descriptor = "(Leu;)V")
	class161(class155 var1) {
		this.this$0 = var1;
		this.field1752 = new float[4];
		this.field1758 = 1;
		this.field1757 = 1;
		this.field1759 = 0;
	}

	@ObfuscatedName("s")
	public static String method3219(long var0) {
		Calendar.Calendar_calendar.setTime(new Date(var0));
		int var2 = Calendar.Calendar_calendar.get(7);
		int var3 = Calendar.Calendar_calendar.get(5);
		int var4 = Calendar.Calendar_calendar.get(2);
		int var5 = Calendar.Calendar_calendar.get(1);
		int var6 = Calendar.Calendar_calendar.get(11);
		int var7 = Calendar.Calendar_calendar.get(12);
		int var8 = Calendar.Calendar_calendar.get(13);
		return Calendar.DAYS_OF_THE_WEEK[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(III)I", garbageValue = "-1772681891")
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
		if (var2 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V", garbageValue = "0")
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = ((ChatChannel) (Messages.Messages_channels.get(var0)));
		if (var4 == null) {
			var4 = new ChatChannel();
			Messages.Messages_channels.put(var0, var4);
		}
		Message var5 = var4.addMessage(var0, var1, var2, var3);
		Messages.Messages_hashTable.put(var5, ((long) (var5.count)));
		Messages.Messages_queue.add(var5);
		Client.chatCycle = Client.cycleCntr;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lbd;Lbd;IZIZS)I", garbageValue = "-14807")
	static int method3220(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
		int var6 = class434.compareWorlds(var0, var1, var2, var3);
		if (var6 != 0) {
			return var3 ? -var6 : var6;
		} else if (var4 == -1) {
			return 0;
		} else {
			int var7 = class434.compareWorlds(var0, var1, var4, var5);
			return var5 ? -var7 : var7;
		}
	}
}