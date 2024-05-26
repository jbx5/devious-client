import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
public class class30 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	public static AbstractArchive field158;
	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static WorldView field155;
	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	static IndexedSprite[] field156;

	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)[Lmz;",
		garbageValue = "111"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field3481, ServerPacket.field3401, ServerPacket.field3402, ServerPacket.field3452, ServerPacket.field3404, ServerPacket.field3519, ServerPacket.field3406, ServerPacket.field3467, ServerPacket.field3408, ServerPacket.field3409, ServerPacket.field3475, ServerPacket.field3411, ServerPacket.field3412, ServerPacket.field3413, ServerPacket.field3414, ServerPacket.field3415, ServerPacket.field3506, ServerPacket.field3464, ServerPacket.field3418, ServerPacket.field3493, ServerPacket.field3420, ServerPacket.field3421, ServerPacket.field3473, ServerPacket.field3423, ServerPacket.field3416, ServerPacket.field3425, ServerPacket.field3517, ServerPacket.field3427, ServerPacket.field3428, ServerPacket.field3429, ServerPacket.field3430, ServerPacket.field3431, ServerPacket.field3432, ServerPacket.field3433, ServerPacket.field3434, ServerPacket.field3456, ServerPacket.field3500, ServerPacket.field3437, ServerPacket.field3438, ServerPacket.field3530, ServerPacket.field3440, ServerPacket.field3531, ServerPacket.field3442, ServerPacket.field3479, ServerPacket.field3444, ServerPacket.field3445, ServerPacket.field3465, ServerPacket.field3505, ServerPacket.field3441, ServerPacket.field3449, ServerPacket.field3450, ServerPacket.field3446, ServerPacket.field3410, ServerPacket.field3453, ServerPacket.field3454, ServerPacket.field3455, ServerPacket.field3422, ServerPacket.field3457, ServerPacket.field3458, ServerPacket.field3459, ServerPacket.field3460, ServerPacket.field3461, ServerPacket.field3462, ServerPacket.field3503, ServerPacket.field3436, ServerPacket.field3405, ServerPacket.field3466, ServerPacket.field3403, ServerPacket.field3468, ServerPacket.field3469, ServerPacket.field3470, ServerPacket.field3463, ServerPacket.field3472, ServerPacket.field3448, ServerPacket.field3474, ServerPacket.field3443, ServerPacket.field3476, ServerPacket.field3477, ServerPacket.field3489, ServerPacket.field3471, ServerPacket.field3480, ServerPacket.field3486, ServerPacket.field3482, ServerPacket.field3417, ServerPacket.field3484, ServerPacket.field3485, ServerPacket.field3512, ServerPacket.field3487, ServerPacket.field3488, ServerPacket.field3502, ServerPacket.field3439, ServerPacket.field3478, ServerPacket.field3492, ServerPacket.field3491, ServerPacket.field3494, ServerPacket.field3495, ServerPacket.field3424, ServerPacket.field3497, ServerPacket.field3498, ServerPacket.field3499, ServerPacket.field3496, ServerPacket.field3501, ServerPacket.field3513, ServerPacket.field3529, ServerPacket.field3483, ServerPacket.field3447, ServerPacket.field3451, ServerPacket.field3507, ServerPacket.field3508, ServerPacket.field3509, ServerPacket.field3504, ServerPacket.field3511, ServerPacket.field3510, ServerPacket.field3419, ServerPacket.field3514, ServerPacket.field3515, ServerPacket.field3516, ServerPacket.field3400, ServerPacket.field3518, ServerPacket.field3527, ServerPacket.field3520, ServerPacket.field3435, ServerPacket.field3522, ServerPacket.field3523, ServerPacket.field3524, ServerPacket.field3525, ServerPacket.field3526, ServerPacket.field3521, ServerPacket.field3528, ServerPacket.field3490};
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2122436127"
	)
	public static void method445() {
		DbRowType.DBRowType_cache.clear();
	}
}
