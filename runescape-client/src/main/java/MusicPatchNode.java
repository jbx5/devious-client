import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("jl")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("ib")
	@ObfuscatedSignature(descriptor = "[Lqn;")
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;

	@ObfuscatedName("in")
	@ObfuscatedSignature(descriptor = "[Lqn;")
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -858115537)
	int field3280;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Ljz;")
	@Export("patch")
	MusicPatch patch;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Ljo;")
	MusicPatchNode2 field3284;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lag;")
	@Export("rawSound")
	RawSound rawSound;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1321665391)
	int field3267;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -958369533)
	int field3286;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 184759277)
	int field3269;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 811162021)
	int field3270;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 454676573)
	int field3271;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = -1127763817)
	int field3272;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = -1004966367)
	int field3273;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = -1549655637)
	int field3263;

	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = 872135919)
	int field3275;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = -1625478891)
	int field3276;

	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 1229693699)
	int field3266;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = -1645502181)
	int field3281;

	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = -621276451)
	int field3268;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 1643471743)
	int field3279;

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "Lan;")
	@Export("stream")
	RawPcmStream stream;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = -346801283)
	int field3282;

	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = 1834351605)
	int field3283;

	MusicPatchNode() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "2")
	void method5415() {
		this.patch = null;
		this.rawSound = null;
		this.field3284 = null;
		this.stream = null;
	}
}