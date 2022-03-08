import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("x")
public class class14 {
    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = -845209745)
    final int field85;

    @ObfuscatedName("l")
    final String field83;

    @ObfuscatedName("s")
    final ThreadFactory field84;

    @ObfuscatedName("e")
    final ThreadPoolExecutor field82;

    public class14(String var1, int var2, int var3) {
        this.field83 = var1;
        this.field85 = var2;
        this.field84 = new class16(this);
        this.field82 = this.method167(var3);
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(IB)Ljava/util/concurrent/ThreadPoolExecutor;", garbageValue = "1")
    final ThreadPoolExecutor method167(int var1) {
        return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field85), this.field84);
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Ly;I)Lj;", garbageValue = "2078751615")
    public class19 method174(class10 var1) {
        if (this.field82.getQueue().remainingCapacity() <= 0) {
            System.err.println((("REST thread pool queue is empty\r\nThread pool size " + this.field82.getCorePoolSize()) + " Queue capacity ") + this.field85);
            return new class19("Queue full");
        } else {
            class19 var2 = new class19(this.field82.submit(new class20(this, var1)));
            return var2;
        }
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1535010747")
    public final void method169() {
        try {
            this.field82.shutdown();
        } catch (Exception var2) {
            System.err.println("Error shutting down RestRequestService\r\n" + var2);
        }
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(II)Loi;", garbageValue = "-108388034")
    public static class414 method178(int var0) {
        int var1 = class412.field4484[var0];
        if (var1 == 1) {
            return class414.field4487;
        } else if (var1 == 2) {
            return class414.field4495;
        } else {
            return var1 == 3 ? class414.field4489 : null;
        }
    }

    @ObfuscatedName("ie")
    @ObfuscatedSignature(descriptor = "(Lcw;IIIB)V", garbageValue = "-98")
    @Export("addPlayerToMenu")
    static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
        if (WorldMapSprite.localPlayer != var0) {
            if (Client.menuOptionsCount < 400) {
                String var4;
                int var7;
                if (var0.skillLevel == 0) {
                    String var5 = (var0.actions[0] + var0.username) + var0.actions[1];
                    var7 = var0.combatLevel;
                    int var8 = WorldMapSprite.localPlayer.combatLevel;
                    int var9 = var8 - var7;
                    String var6;
                    if (var9 < (-9)) {
                        var6 = LoginScreenAnimation.colorStartTag(16711680);
                    } else if (var9 < (-6)) {
                        var6 = LoginScreenAnimation.colorStartTag(16723968);
                    } else if (var9 < (-3)) {
                        var6 = LoginScreenAnimation.colorStartTag(16740352);
                    } else if (var9 < 0) {
                        var6 = LoginScreenAnimation.colorStartTag(16756736);
                    } else if (var9 > 9) {
                        var6 = LoginScreenAnimation.colorStartTag(65280);
                    } else if (var9 > 6) {
                        var6 = LoginScreenAnimation.colorStartTag(4259584);
                    } else if (var9 > 3) {
                        var6 = LoginScreenAnimation.colorStartTag(8453888);
                    } else if (var9 > 0) {
                        var6 = LoginScreenAnimation.colorStartTag(12648192);
                    } else {
                        var6 = LoginScreenAnimation.colorStartTag(16776960);
                    }
                    var4 = ((((((var5 + var6) + " ") + " (") + "level-") + var0.combatLevel) + ")") + var0.actions[2];
                } else {
                    var4 = (((((((var0.actions[0] + var0.username) + var0.actions[1]) + " ") + " (") + "skill-") + var0.skillLevel) + ")") + var0.actions[2];
                }
                int var10;
                if (Client.isItemSelected == 1) {
                    class11.insertMenuItemNoShift("Use", ((((Client.selectedItemName + " ") + "->") + " ") + LoginScreenAnimation.colorStartTag(16777215)) + var4, 14, var1, var2, var3);
                } else if (Client.isSpellSelected) {
                    if ((RouteStrategy.selectedSpellFlags & 8) == 8) {
                        class11.insertMenuItemNoShift(Client.selectedSpellActionName, ((((Client.selectedSpellName + " ") + "->") + " ") + LoginScreenAnimation.colorStartTag(16777215)) + var4, 15, var1, var2, var3);
                    }
                } else {
                    for (var10 = 7; var10 >= 0; --var10) {
                        if (Client.playerMenuActions[var10] != null) {
                            short var11 = 0;
                            if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) {
                                if (Client.playerAttackOption == AttackOption.AttackOption_hidden) {
                                    continue;
                                }
                                if ((AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption) || ((Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels) && (var0.combatLevel > WorldMapSprite.localPlayer.combatLevel))) {
                                    var11 = 2000;
                                }
                                if ((WorldMapSprite.localPlayer.team != 0) && (var0.team != 0)) {
                                    if (var0.team == WorldMapSprite.localPlayer.team) {
                                        var11 = 2000;
                                    } else {
                                        var11 = 0;
                                    }
                                } else if ((Client.playerAttackOption == AttackOption.field1263) && var0.isClanMember()) {
                                    var11 = 2000;
                                }
                            } else if (Client.playerOptionsPriorities[var10]) {
                                var11 = 2000;
                            }
                            boolean var12 = false;
                            var7 = Client.playerMenuOpcodes[var10] + var11;
                            class11.insertMenuItemNoShift(Client.playerMenuActions[var10], LoginScreenAnimation.colorStartTag(16777215) + var4, var7, var1, var2, var3);
                        }
                    }
                }
                for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) {
                    if (Client.menuOpcodes[var10] == 23) {
                        Client.menuTargets[var10] = LoginScreenAnimation.colorStartTag(16777215) + var4;
                        break;
                    }
                }
            }
        }
    }
}