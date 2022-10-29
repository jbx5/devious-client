import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
@Implements("Coord")
public class Coord {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1160775587
   )
   @Export("plane")
   public int plane;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1700089243
   )
   @Export("x")
   public int x;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -680325577
   )
   @Export("y")
   public int y;

   @ObfuscatedSignature(
      descriptor = "(Lki;)V"
   )
   public Coord(Coord var1) {
      this.plane = var1.plane;
      this.x = var1.x;
      this.y = var1.y;
   }

   public Coord(int var1, int var2, int var3) {
      this.plane = var1;
      this.x = var2;
      this.y = var3;
   }

   public Coord(int var1) {
      if (var1 == -1) {
         this.plane = -1;
      } else {
         this.plane = var1 >> 28 & 3;
         this.x = var1 >> 14 & 16383;
         this.y = var1 & 16383;
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-282255296"
   )
   @Export("packed")
   public int packed() {
      int var2 = this.plane;
      int var3 = this.x;
      int var4 = this.y;
      int var1 = var2 << 28 | var3 << 14 | var4;
      return var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lki;I)Z",
      garbageValue = "1951856036"
   )
   @Export("equalsCoord")
   boolean equalsCoord(Coord var1) {
      if (this.plane != var1.plane) {
         return false;
      } else if (this.x != var1.x) {
         return false;
      } else {
         return this.y == var1.y;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
      garbageValue = "127"
   )
   @Export("toString")
   String toString(String var1) {
      return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63);
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1);
      }
   }

   public String toString() {
      return this.toString(",");
   }

   public int hashCode() {
      return this.packed();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)Lov;",
      garbageValue = "-1033948030"
   )
   public static class407 method5706() {
      synchronized(class407.field4563) {
         if (class407.field4565 == 0) {
            return new class407();
         } else {
            class407.field4563[--class407.field4565].method7646();
            return class407.field4563[class407.field4565];
         }
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/CharSequence;IIB)Ljava/lang/String;",
      garbageValue = "-9"
   )
   public static String method5704(CharSequence[] var0, int var1, int var2) {
      if (var2 == 0) {
         return "";
      } else if (var2 == 1) {
         CharSequence var10 = var0[var1];
         return var10 == null ? "null" : var10.toString();
      } else {
         int var3 = var2 + var1;
         int var4 = 0;

         for(int var5 = var1; var5 < var3; ++var5) {
            CharSequence var9 = var0[var5];
            if (var9 == null) {
               var4 += 4;
            } else {
               var4 += var9.length();
            }
         }

         StringBuilder var8 = new StringBuilder(var4);

         for(int var6 = var1; var6 < var3; ++var6) {
            CharSequence var7 = var0[var6];
            if (var7 == null) {
               var8.append("null");
            } else {
               var8.append(var7);
            }
         }

         return var8.toString();
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(ILob;Llx;B)V",
      garbageValue = "-34"
   )
   static void method5688(int var0, ArchiveDisk var1, Archive var2) {
      ArchiveDiskAction var3 = new ArchiveDiskAction();
      var3.type = 1;
      var3.key = (long)var0;
      var3.archiveDisk = var1;
      var3.archive = var2;
      synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
         ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
      }

      synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
         if (ArchiveDiskActionHandler.field4122 == 0) {
            ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
            ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
            ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
            ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
         }

         ArchiveDiskActionHandler.field4122 = 600;
      }
   }

   @ObfuscatedName("jj")
   @ObfuscatedSignature(
      descriptor = "(Lcc;IIII)V",
      garbageValue = "-1785567817"
   )
   @Export("addNpcToMenu")
   static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
      NPCComposition var4 = var0.definition;
      if (Client.menuOptionsCount < 400) {
         if (var4.transforms != null) {
            var4 = var4.transform();
         }

         if (var4 != null) {
            if (var4.isInteractable) {
               if (!var4.isFollower || Client.followerIndex == var1) {
                  String var5 = var0.method2492();
                  int var6;
                  int var9;
                  if (var4.combatLevel != 0 && var0.field1212 != 0) {
                     var6 = var0.field1212 != -1 ? var0.field1212 : var4.combatLevel;
                     var9 = class296.localPlayer.combatLevel;
                     int var10 = var9 - var6;
                     String var8;
                     if (var10 < -9) {
                        var8 = GameObject.colorStartTag(16711680);
                     } else if (var10 < -6) {
                        var8 = GameObject.colorStartTag(16723968);
                     } else if (var10 < -3) {
                        var8 = GameObject.colorStartTag(16740352);
                     } else if (var10 < 0) {
                        var8 = GameObject.colorStartTag(16756736);
                     } else if (var10 > 9) {
                        var8 = GameObject.colorStartTag(65280);
                     } else if (var10 > 6) {
                        var8 = GameObject.colorStartTag(4259584);
                     } else if (var10 > 3) {
                        var8 = GameObject.colorStartTag(8453888);
                     } else if (var10 > 0) {
                        var8 = GameObject.colorStartTag(12648192);
                     } else {
                        var8 = GameObject.colorStartTag(16776960);
                     }

                     var5 = var5 + var8 + " " + " (" + "level-" + var6 + ")";
                  }

                  if (var4.isFollower && Client.followerOpsLowPriority) {
                     class16.insertMenuItemNoShift("Examine", GameObject.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
                  }

                  if (Client.isItemSelected == 1) {
                     class16.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + GameObject.colorStartTag(16776960) + var5, 7, var1, var2, var3);
                  } else if (Client.isSpellSelected) {
                     if ((UserComparator5.selectedSpellFlags & 2) == 2) {
                        class16.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + GameObject.colorStartTag(16776960) + var5, 8, var1, var2, var3);
                     }
                  } else {
                     var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0;
                     String[] var7 = var4.actions;
                     int var11;
                     if (var7 != null) {
                        for(var11 = 4; var11 >= 0; --var11) {
                           if (var0.method2511(var11) && var7[var11] != null && !var7[var11].equalsIgnoreCase("Attack")) {
                              var9 = 0;
                              if (var11 == 0) {
                                 var9 = var6 + 9;
                              }

                              if (var11 == 1) {
                                 var9 = var6 + 10;
                              }

                              if (var11 == 2) {
                                 var9 = var6 + 11;
                              }

                              if (var11 == 3) {
                                 var9 = var6 + 12;
                              }

                              if (var11 == 4) {
                                 var9 = var6 + 13;
                              }

                              class16.insertMenuItemNoShift(var7[var11], GameObject.colorStartTag(16776960) + var5, var9, var1, var2, var3);
                           }
                        }
                     }

                     if (var7 != null) {
                        for(var11 = 4; var11 >= 0; --var11) {
                           if (var0.method2511(var11) && var7[var11] != null && var7[var11].equalsIgnoreCase("Attack")) {
                              short var12 = 0;
                              if (Client.npcAttackOption != AttackOption.AttackOption_hidden) {
                                 if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var4.combatLevel > class296.localPlayer.combatLevel) {
                                    var12 = 2000;
                                 }

                                 var9 = 0;
                                 if (var11 == 0) {
                                    var9 = var12 + 9;
                                 }

                                 if (var11 == 1) {
                                    var9 = var12 + 10;
                                 }

                                 if (var11 == 2) {
                                    var9 = var12 + 11;
                                 }

                                 if (var11 == 3) {
                                    var9 = var12 + 12;
                                 }

                                 if (var11 == 4) {
                                    var9 = var12 + 13;
                                 }

                                 class16.insertMenuItemNoShift(var7[var11], GameObject.colorStartTag(16776960) + var5, var9, var1, var2, var3);
                              }
                           }
                        }
                     }

                     if (!var4.isFollower || !Client.followerOpsLowPriority) {
                        class16.insertMenuItemNoShift("Examine", GameObject.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
                     }
                  }

               }
            }
         }
      }
   }
}
