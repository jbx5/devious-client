import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("s")
class class17 implements SSLSession {
   @ObfuscatedName("ge")
   static String field102;
   @ObfuscatedName("hw")
   @ObfuscatedGetter(
      intValue = -1898843179
   )
   static int field101;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Li;"
   )
   final class12 this$1;

   @ObfuscatedSignature(
      descriptor = "(Li;)V"
   )
   class17(class12 var1) {
      this.this$1 = var1;
   }

   public String getCipherSuite() {
      throw new UnsupportedOperationException();
   }

   public long getLastAccessedTime() {
      throw new UnsupportedOperationException();
   }

   public Object getValue(String var1) {
      throw new UnsupportedOperationException();
   }

   public Certificate[] getLocalCertificates() {
      throw new UnsupportedOperationException();
   }

   public int getPacketBufferSize() {
      throw new UnsupportedOperationException();
   }

   public Principal getLocalPrincipal() {
      throw new UnsupportedOperationException();
   }

   public String getPeerHost() {
      throw new UnsupportedOperationException();
   }

   public int getPeerPort() {
      return 0;
   }

   public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
      return null;
   }

   public String getProtocol() {
      throw new UnsupportedOperationException();
   }

   public SSLSessionContext getSessionContext() {
      throw new UnsupportedOperationException();
   }

   public String[] getValueNames() {
      throw new UnsupportedOperationException();
   }

   public void putValue(String var1, Object var2) {
      throw new UnsupportedOperationException();
   }

   public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
      return this.this$1.field69;
   }

   public void removeValue(String var1) {
      throw new UnsupportedOperationException();
   }

   public byte[] getId() {
      throw new UnsupportedOperationException();
   }

   public void invalidate() {
      throw new UnsupportedOperationException();
   }

   public boolean isValid() {
      throw new UnsupportedOperationException();
   }

   public int getApplicationBufferSize() {
      return 0;
   }

   public long getCreationTime() {
      throw new UnsupportedOperationException();
   }

   public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
      return null;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-9821"
   )
   public static final void method252() {
      ViewportMouse.ViewportMouse_isInViewport = false;
      ViewportMouse.ViewportMouse_entityCount = 0;
   }

   @ObfuscatedName("kl")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "-1377085208"
   )
   @Export("addSceneMenuOptions")
   static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
      if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
         ObjectSound.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
      }

      long var4 = -1L;
      long var6 = -1L;
      int var8 = 0;

      while(true) {
         int var10 = ViewportMouse.ViewportMouse_entityCount;
         if (var8 >= var10) {
            if (-1L != var4) {
               var8 = ClanChannelMember.method3084(var4);
               int var9 = (int)(var4 >>> 7 & 127L);
               Player var11 = Client.players[Client.combatTargetPlayerIndex];
               ServerPacket.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var9);
            }

            return;
         }

         long var26 = ViewportMouse.ViewportMouse_entityTags[var8];
         if (var6 != var26) {
            label373: {
               var6 = var26;
               int var15 = class89.method2336(var8);
               long var18 = ViewportMouse.ViewportMouse_entityTags[var8];
               int var17 = (int)(var18 >>> 7 & 127L);
               var17 = var17;
               int var28 = WorldMapSprite.method5272(var8);
               int var19 = Projectile.method2105(var8);
               int var23;
               int var24;
               if (var28 == 2 && ReflectionCheck.scene.getObjectFlags(class383.Client_plane, var15, var17, var26) >= 0) {
                  ObjectComposition var20 = VarpDefinition.getObjectDefinition(var19);
                  if (var20.transforms != null) {
                     var20 = var20.transform();
                  }

                  if (var20 == null) {
                     break label373;
                  }

                  PendingSpawn var21 = null;

                  for(PendingSpawn var22 = (PendingSpawn)Client.pendingSpawns.last(); var22 != null; var22 = (PendingSpawn)Client.pendingSpawns.previous()) {
                     if (var22.plane == class383.Client_plane && var15 == var22.x && var17 == var22.y && var19 == var22.field1167) {
                        var21 = var22;
                        break;
                     }
                  }

                  if (Client.isItemSelected == 1) {
                     ObjectSound.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + MouseRecorder.colorStartTag(65535) + var20.name, 1, var19, var15, var17);
                  } else if (Client.isSpellSelected) {
                     if ((class21.selectedSpellFlags & 4) == 4) {
                        ObjectSound.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + MouseRecorder.colorStartTag(65535) + var20.name, 2, var19, var15, var17);
                     }
                  } else {
                     String[] var36 = var20.actions;
                     if (var36 != null) {
                        for(var23 = 4; var23 >= 0; --var23) {
                           if ((var21 == null || var21.method2341(var23)) && var36[var23] != null) {
                              var24 = 0;
                              if (var23 == 0) {
                                 var24 = 3;
                              }

                              if (var23 == 1) {
                                 var24 = 4;
                              }

                              if (var23 == 2) {
                                 var24 = 5;
                              }

                              if (var23 == 3) {
                                 var24 = 6;
                              }

                              if (var23 == 4) {
                                 var24 = 1001;
                              }

                              ObjectSound.insertMenuItemNoShift(var36[var23], MouseRecorder.colorStartTag(65535) + var20.name, var24, var19, var15, var17);
                           }
                        }
                     }

                     ObjectSound.insertMenuItemNoShift("Examine", MouseRecorder.colorStartTag(65535) + var20.name, 1002, var20.id, var15, var17);
                  }
               }

               int var29;
               Player var30;
               NPC var37;
               int[] var38;
               if (var28 == 1) {
                  NPC var32 = Client.npcs[var19];
                  if (var32 == null) {
                     break label373;
                  }

                  if (var32.definition.size == 1 && (var32.x & 127) == 64 && (var32.y & 127) == 64) {
                     for(var29 = 0; var29 < Client.npcCount; ++var29) {
                        var37 = Client.npcs[Client.npcIndices[var29]];
                        if (var37 != null && var37 != var32 && var37.definition.size == 1 && var37.x == var32.x && var32.y == var37.y) {
                           ReflectionCheck.addNpcToMenu(var37, Client.npcIndices[var29], var15, var17);
                        }
                     }

                     var29 = Players.Players_count;
                     var38 = Players.Players_indices;

                     for(var23 = 0; var23 < var29; ++var23) {
                        var30 = Client.players[var38[var23]];
                        if (var30 != null && var30.x == var32.x && var32.y == var30.y) {
                           ServerPacket.addPlayerToMenu(var30, var38[var23], var15, var17);
                        }
                     }
                  }

                  ReflectionCheck.addNpcToMenu(var32, var19, var15, var17);
               }

               if (var28 == 0) {
                  Player var33 = Client.players[var19];
                  if (var33 == null) {
                     break label373;
                  }

                  if ((var33.x & 127) == 64 && (var33.y & 127) == 64) {
                     for(var29 = 0; var29 < Client.npcCount; ++var29) {
                        var37 = Client.npcs[Client.npcIndices[var29]];
                        if (var37 != null && var37.definition.size == 1 && var33.x == var37.x && var33.y == var37.y) {
                           ReflectionCheck.addNpcToMenu(var37, Client.npcIndices[var29], var15, var17);
                        }
                     }

                     var29 = Players.Players_count;
                     var38 = Players.Players_indices;

                     for(var23 = 0; var23 < var29; ++var23) {
                        var30 = Client.players[var38[var23]];
                        if (var30 != null && var30 != var33 && var33.x == var30.x && var30.y == var33.y) {
                           ServerPacket.addPlayerToMenu(var30, var38[var23], var15, var17);
                        }
                     }
                  }

                  if (var19 != Client.combatTargetPlayerIndex) {
                     ServerPacket.addPlayerToMenu(var33, var19, var15, var17);
                  } else {
                     var4 = var26;
                  }
               }

               if (var28 == 3) {
                  NodeDeque var34 = Client.groundItems[class383.Client_plane][var15][var17];
                  if (var34 != null) {
                     for(TileItem var35 = (TileItem)var34.first(); var35 != null; var35 = (TileItem)var34.next()) {
                        ItemComposition var39 = NPCComposition.ItemDefinition_get(var35.id);
                        if (Client.isItemSelected == 1) {
                           ObjectSound.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + MouseRecorder.colorStartTag(16748608) + var39.name, 16, var35.id, var15, var17);
                        } else if (Client.isSpellSelected) {
                           if ((class21.selectedSpellFlags & 1) == 1) {
                              ObjectSound.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + MouseRecorder.colorStartTag(16748608) + var39.name, 17, var35.id, var15, var17);
                           }
                        } else {
                           String[] var31 = var39.groundActions;

                           for(var24 = 4; var24 >= 0; --var24) {
                              if (var35.method2613(var24)) {
                                 if (var31 != null && var31[var24] != null) {
                                    byte var25 = 0;
                                    if (var24 == 0) {
                                       var25 = 18;
                                    }

                                    if (var24 == 1) {
                                       var25 = 19;
                                    }

                                    if (var24 == 2) {
                                       var25 = 20;
                                    }

                                    if (var24 == 3) {
                                       var25 = 21;
                                    }

                                    if (var24 == 4) {
                                       var25 = 22;
                                    }

                                    ObjectSound.insertMenuItemNoShift(var31[var24], MouseRecorder.colorStartTag(16748608) + var39.name, var25, var35.id, var15, var17);
                                 } else if (var24 == 2) {
                                    ObjectSound.insertMenuItemNoShift("Take", MouseRecorder.colorStartTag(16748608) + var39.name, 20, var35.id, var15, var17);
                                 }
                              }
                           }

                           ObjectSound.insertMenuItemNoShift("Examine", MouseRecorder.colorStartTag(16748608) + var39.name, 1004, var35.id, var15, var17);
                        }
                     }
                  }
               }
            }
         }

         ++var8;
      }
   }
}
