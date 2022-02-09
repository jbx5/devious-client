import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ki")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
    @ObfuscatedName("gb")
    @ObfuscatedSignature(descriptor = "Lfw;")
    @Export("socketTask")
    static Task socketTask;

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lkz;")
    @Export("archive")
    public Archive archive;

    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -2046840871)
    @Export("crc")
    public int crc;

    @ObfuscatedName("s")
    @Export("padding")
    public byte padding;

    NetFileRequest() {
    }

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "(Lpi;J)V")
    static void method5573(Buffer var0, long var1) {
        var1 /= 10L;
        if (var1 < 0L) {
            var1 = 0L;
        } else if (var1 > 65535L) {
            var1 = 65535L;
        }
        var0.writeShort(((int) (var1)));
    }

    @ObfuscatedName("gk")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "62")
    static void method5572() {
        if ((Client.combatTargetPlayerIndex >= 0) && (Client.players[Client.combatTargetPlayerIndex] != null)) {
            AbstractWorldMapData.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false);
        }
    }

    @ObfuscatedName("kn")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1305407373")
    @Export("changeGameOptions")
    static final void changeGameOptions(int var0) {
        WorldMapAreaData.method4855();
        for (ObjectSound var1 = ((ObjectSound) (ObjectSound.objectSounds.last())); var1 != null; var1 = ((ObjectSound) (ObjectSound.objectSounds.previous()))) {
            if (var1.obj != null) {
                var1.set();
            }
        }
        int var4 = PcmPlayer.VarpDefinition_get(var0).type;
        if (var4 != 0) {
            int var2 = Varps.Varps_main[var0];
            if (var4 == 1) {
                if (var2 == 1) {
                    LoginType.method7149(0.9);
                }
                if (var2 == 2) {
                    LoginType.method7149(0.8);
                }
                if (var2 == 3) {
                    LoginType.method7149(0.7);
                }
                if (var2 == 4) {
                    LoginType.method7149(0.6);
                }
            }
            if (var4 == 3) {
                if (var2 == 0) {
                    class21.method299(255);
                }
                if (var2 == 1) {
                    class21.method299(192);
                }
                if (var2 == 2) {
                    class21.method299(128);
                }
                if (var2 == 3) {
                    class21.method299(64);
                }
                if (var2 == 4) {
                    class21.method299(0);
                }
            }
            if (var4 == 4) {
                if (var2 == 0) {
                    MouseHandler.updateSoundEffectVolume(127);
                }
                if (var2 == 1) {
                    MouseHandler.updateSoundEffectVolume(96);
                }
                if (var2 == 2) {
                    MouseHandler.updateSoundEffectVolume(64);
                }
                if (var2 == 3) {
                    MouseHandler.updateSoundEffectVolume(32);
                }
                if (var2 == 4) {
                    MouseHandler.updateSoundEffectVolume(0);
                }
            }
            if (var4 == 5) {
                Client.leftClickOpensMenu = var2;
            }
            if (var4 == 6) {
                Client.chatEffects = var2;
            }
            if (var4 == 9) {
                Client.field669 = var2;
            }
            if (var4 == 10) {
                if (var2 == 0) {
                    UrlRequest.method2424(127);
                }
                if (var2 == 1) {
                    UrlRequest.method2424(96);
                }
                if (var2 == 2) {
                    UrlRequest.method2424(64);
                }
                if (var2 == 3) {
                    UrlRequest.method2424(32);
                }
                if (var2 == 4) {
                    UrlRequest.method2424(0);
                }
            }
            if (var4 == 17) {
                Client.followerIndex = var2 & 65535;
            }
            AttackOption[] var3;
            if (var4 == 18) {
                var3 = new AttackOption[]{ AttackOption.field1267, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden, AttackOption.AttackOption_alwaysRightClick, AttackOption.field1263 };
                Client.playerAttackOption = ((AttackOption) (class140.findEnumerated(var3, var2)));
                if (Client.playerAttackOption == null) {
                    Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
                }
            }
            if (var4 == 19) {
                if (var2 == (-1)) {
                    Client.combatTargetPlayerIndex = -1;
                } else {
                    Client.combatTargetPlayerIndex = var2 & 2047;
                }
            }
            if (var4 == 22) {
                var3 = new AttackOption[]{ AttackOption.field1267, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden, AttackOption.AttackOption_alwaysRightClick, AttackOption.field1263 };
                Client.npcAttackOption = ((AttackOption) (class140.findEnumerated(var3, var2)));
                if (Client.npcAttackOption == null) {
                    Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
                }
            }
        }
    }
}