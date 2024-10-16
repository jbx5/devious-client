import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONException;
import org.json.JSONObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi, class339 {
	@ObfuscatedName("wi")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final class277 field795;
	@ObfuscatedName("wv")
	@ObfuscatedSignature(
		descriptor = "Lcg;"
	)
	static final ApproximateRouteStrategy field769;
	@ObfuscatedName("xe")
	static int[] field801;
	@ObfuscatedName("wt")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("xg")
	static int[] field506;
	@ObfuscatedName("wf")
	@ObfuscatedGetter(
		intValue = -114882557
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("wu")
	@ObfuscatedGetter(
		intValue = 860115079
	)
	static int field741;
	@ObfuscatedName("wg")
	@ObfuscatedGetter(
		intValue = 680565095
	)
	static int field507;
	@ObfuscatedName("be")
	static boolean field788;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 769068277
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1202199295
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -959285439
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("cf")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("cl")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 2120545603
	)
	static int field537;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 185218953
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -404893041
	)
	static int field508;
	@ObfuscatedName("cz")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("dd")
	static boolean field510;
	@ObfuscatedName("dc")
	static boolean field618;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -1869319151
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("dr")
	static boolean field513;
	@ObfuscatedName("dh")
	static boolean field596;
	@ObfuscatedName("dg")
	static boolean field719;
	@ObfuscatedName("dm")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -330508271
	)
	@Export("cycle")
	public static int cycle;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 62680959
	)
	@Export("serverCycle")
	static int serverCycle;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		longValue = 7764202104596476801L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 479423797
	)
	static int field706;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -883739243
	)
	static int field723;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		longValue = 5709852438780986837L
	)
	static long field522;
	@ObfuscatedName("dy")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 191829695
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -139275429
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = 1480700531
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -240713303
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 522991519
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 1115458161
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("eg")
	@ObfuscatedGetter(
		intValue = -1967951446
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("ev")
	@ObfuscatedGetter(
		intValue = 1349476023
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = 556360640
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("er")
	@Export("z")
	static boolean z;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static class95 field536;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = -872251289
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = 1380094601
	)
	static int field538;
	@ObfuscatedName("ff")
	@ObfuscatedGetter(
		intValue = 655033923
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("fs")
	@ObfuscatedGetter(
		intValue = -585451355
	)
	static int field540;
	@ObfuscatedName("fz")
	@ObfuscatedGetter(
		intValue = 316194787
	)
	static int field541;
	@ObfuscatedName("fy")
	@ObfuscatedGetter(
		intValue = 1033733407
	)
	static int field542;
	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	@Export("authenticationScheme")
	static AuthenticationScheme authenticationScheme;
	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	static class562 field616;
	@ObfuscatedName("gs")
	@Export("BASIC_AUTH_DESKTOP_OSRS")
	static final String BASIC_AUTH_DESKTOP_OSRS;
	@ObfuscatedName("ge")
	@Export("BASIC_AUTH_DESKTOP_RUNELITE")
	static final String BASIC_AUTH_DESKTOP_RUNELITE;
	@ObfuscatedName("hy")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("hl")
	static int[] field559;
	@ObfuscatedName("hz")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("hh")
	@ObfuscatedGetter(
		intValue = 169854915
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("hb")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("ii")
	@ObfuscatedGetter(
		intValue = 1789417555
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("ia")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "Lrf;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("if")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("it")
	static String field659;
	@ObfuscatedName("ib")
	@ObfuscatedGetter(
		intValue = 1459441639
	)
	static int field653;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = -1910802741
	)
	static int field572;
	@ObfuscatedName("ie")
	@ObfuscatedGetter(
		intValue = -1731510697
	)
	static int field571;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = 1059818213
	)
	static int field574;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = 47800043
	)
	static int field514;
	@ObfuscatedName("jb")
	static int[][][] field576;
	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("worldViewManager")
	static WorldViewManager worldViewManager;
	@ObfuscatedName("ja")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("jo")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("jk")
	static final int[] field580;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = -1246805187
	)
	static int field734;
	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	@Export("playerUpdateManager")
	static PlayerUpdateManager playerUpdateManager;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = -1815114593
	)
	@Export("graphicsCycle")
	static int graphicsCycle;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = -216547713
	)
	static int field584;
	@ObfuscatedName("ke")
	@ObfuscatedGetter(
		intValue = 455773917
	)
	static int field678;
	@ObfuscatedName("kj")
	@ObfuscatedGetter(
		intValue = 415672587
	)
	static int field714;
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = 1374945159
	)
	static int field556;
	@ObfuscatedName("kk")
	static boolean field588;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = -833516631
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = 1882572927
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = 1833510775
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = 1413949543
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = 1627431373
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = 1202676005
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = 1415434547
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = -870579019
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = -1321693069
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = -485759651
	)
	static int field598;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = -507957555
	)
	static int field546;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = -1546661181
	)
	static int field600;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = 819841271
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = 964931139
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = -1033247015
	)
	@Export("revision")
	public static int revision;
	@ObfuscatedName("lx")
	static boolean field786;
	@ObfuscatedName("lc")
	@ObfuscatedGetter(
		intValue = 1944436617
	)
	static int field605;
	@ObfuscatedName("lv")
	static boolean field606;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = -1340003411
	)
	static int field607;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = -1626533293
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("lj")
	@ObfuscatedGetter(
		intValue = -1145351299
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("lz")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("la")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("ln")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("le")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("mg")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("ml")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("mo")
	static int[][] field665;
	@ObfuscatedName("mi")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("mu")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(
		intValue = -443456423
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = -806605719
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("mb")
	@ObfuscatedGetter(
		intValue = 1454210871
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		intValue = -1979528461
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = -1171344859
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("mm")
	@ObfuscatedGetter(
		intValue = -541827031
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = -1828266927
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("ms")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("mv")
	@ObfuscatedGetter(
		intValue = -17959927
	)
	static int field627;
	@ObfuscatedName("mz")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		intValue = -190079873
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("md")
	@ObfuscatedGetter(
		intValue = 1876237313
	)
	static int field630;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		longValue = 2981942304363012013L
	)
	@Export("userId")
	static long userId;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		longValue = 3448758816422147141L
	)
	@Export("userHash")
	static long userHash;
	@ObfuscatedName("mn")
	static String field633;
	@ObfuscatedName("np")
	@ObfuscatedGetter(
		intValue = 848100669
	)
	static int field520;
	@ObfuscatedName("nt")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("ni")
	@ObfuscatedGetter(
		intValue = -852470597
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("ns")
	@ObfuscatedGetter(
		intValue = 39021981
	)
	static int field637;
	@ObfuscatedName("nw")
	static int[] field638;
	@ObfuscatedName("nn")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("nj")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("nm")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("ny")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("nk")
	@ObfuscatedGetter(
		intValue = 1564407135
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("nc")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("nd")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("na")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("ne")
	static int[] field647;
	@ObfuscatedName("nz")
	@Export("leftClickOpensMenu")
	static boolean leftClickOpensMenu;
	@ObfuscatedName("nr")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "Lww;"
	)
	@Export("menu")
	static Menu menu;
	@ObfuscatedName("nl")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("oh")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("oe")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = -2144302987
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("oa")
	@ObfuscatedGetter(
		intValue = 1276350675
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("oi")
	@ObfuscatedGetter(
		intValue = 1598350339
	)
	static int field544;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(
		intValue = -104207995
	)
	static int field657;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = 392309539
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("os")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("oy")
	@ObfuscatedGetter(
		intValue = 353908141
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = 155092483
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("oj")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("ou")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = 1832668233
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("or")
	@ObfuscatedGetter(
		intValue = 609619659
	)
	static int field667;
	@ObfuscatedName("oz")
	@ObfuscatedGetter(
		intValue = -1895632781
	)
	static int field668;
	@ObfuscatedName("pg")
	@ObfuscatedGetter(
		intValue = 1010703365
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		intValue = -1919645375
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = -1044411745
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("pw")
	@ObfuscatedGetter(
		intValue = 1797447449
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("pq")
	@ObfuscatedGetter(
		intValue = 546786159
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("pc")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("clickedWidget")
	public static Widget clickedWidget;
	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = 502554539
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("pp")
	@ObfuscatedGetter(
		intValue = 2066840015
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("px")
	static boolean field558;
	@ObfuscatedName("ph")
	@ObfuscatedGetter(
		intValue = 653412049
	)
	static int field758;
	@ObfuscatedName("pi")
	@ObfuscatedGetter(
		intValue = -245647215
	)
	static int field684;
	@ObfuscatedName("pn")
	static boolean field691;
	@ObfuscatedName("pa")
	@ObfuscatedGetter(
		intValue = 2077389225
	)
	static int field686;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = -1474128561
	)
	static int field521;
	@ObfuscatedName("pm")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("pb")
	@ObfuscatedGetter(
		intValue = -959525163
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("qf")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("qn")
	@ObfuscatedGetter(
		intValue = 764581853
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("qu")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("qq")
	@ObfuscatedGetter(
		intValue = 1064390375
	)
	static int field778;
	@ObfuscatedName("qo")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("qj")
	@ObfuscatedGetter(
		intValue = 2101296443
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("qg")
	static int[] field696;
	@ObfuscatedName("qv")
	@ObfuscatedGetter(
		intValue = -675752961
	)
	static int field697;
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = 1546574133
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("qt")
	@ObfuscatedGetter(
		intValue = 1325591999
	)
	static int field586;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = 850901015
	)
	static int field700;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = 1300266067
	)
	static int field701;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = 1587171207
	)
	static int field702;
	@ObfuscatedName("qc")
	@ObfuscatedGetter(
		intValue = -2134887235
	)
	static int field703;
	@ObfuscatedName("qy")
	@ObfuscatedGetter(
		intValue = -1775964815
	)
	static int field704;
	@ObfuscatedName("qx")
	@ObfuscatedGetter(
		intValue = 1060427977
	)
	static int field705;
	@ObfuscatedName("qm")
	@ObfuscatedGetter(
		intValue = -229300643
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("qa")
	@ObfuscatedSignature(
		descriptor = "Lwz;"
	)
	static class575 field707;
	@ObfuscatedName("qb")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("qe")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("scriptEvents2")
	static NodeDeque scriptEvents2;
	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("scriptEvents3")
	static NodeDeque scriptEvents3;
	@ObfuscatedName("rk")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	static NodeDeque field711;
	@ObfuscatedName("ry")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("rt")
	@ObfuscatedGetter(
		intValue = -1121364249
	)
	@Export("rootWidgetCount")
	public static int rootWidgetCount;
	@ObfuscatedName("ri")
	@ObfuscatedGetter(
		intValue = -1251636723
	)
	static int field590;
	@ObfuscatedName("ra")
	@Export("validRootWidgets")
	public static boolean[] validRootWidgets;
	@ObfuscatedName("rd")
	public static boolean[] field716;
	@ObfuscatedName("rc")
	static boolean[] field717;
	@ObfuscatedName("rb")
	@Export("rootWidgetXs")
	public static int[] rootWidgetXs;
	@ObfuscatedName("rh")
	@Export("rootWidgetYs")
	public static int[] rootWidgetYs;
	@ObfuscatedName("ru")
	@Export("rootWidgetWidths")
	public static int[] rootWidgetWidths;
	@ObfuscatedName("rx")
	@Export("rootWidgetHeights")
	public static int[] rootWidgetHeights;
	@ObfuscatedName("rf")
	@ObfuscatedGetter(
		intValue = 1405825093
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("ro")
	@ObfuscatedGetter(
		longValue = -9020673969969387559L
	)
	static long field772;
	@ObfuscatedName("re")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("rg")
	@ObfuscatedGetter(
		intValue = -50692297
	)
	static int field725;
	@ObfuscatedName("rs")
	@ObfuscatedGetter(
		intValue = -962425529
	)
	public static int field726;
	@ObfuscatedName("rw")
	static int[] field771;
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		intValue = -851081673
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("ss")
	@ObfuscatedGetter(
		intValue = 1464063685
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("st")
	static String field730;
	@ObfuscatedName("su")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("sp")
	@ObfuscatedGetter(
		intValue = -825170025
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("se")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("indexCheck")
	public static IndexCheck indexCheck;
	@ObfuscatedName("si")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	static class267 field754;
	@ObfuscatedName("sr")
	@ObfuscatedGetter(
		intValue = -1805330559
	)
	static int field735;
	@ObfuscatedName("sv")
	static int[] field736;
	@ObfuscatedName("sg")
	static int[] field737;
	@ObfuscatedName("so")
	@ObfuscatedGetter(
		longValue = 9131254270281318367L
	)
	static long field709;
	@ObfuscatedName("sq")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("sc")
	@ObfuscatedSignature(
		descriptor = "[Lgy;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("sw")
	@ObfuscatedSignature(
		descriptor = "[Lgw;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("sm")
	@ObfuscatedGetter(
		intValue = 246889749
	)
	static int field578;
	@ObfuscatedName("sn")
	@ObfuscatedGetter(
		intValue = 1055552235
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("sl")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("sf")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "[Lvv;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("sa")
	@ObfuscatedGetter(
		intValue = 1767526859
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("tt")
	@ObfuscatedGetter(
		intValue = -1693485265
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("tf")
	@ObfuscatedGetter(
		intValue = -1383895545
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("tz")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("ty")
	@ObfuscatedGetter(
		intValue = -230015913
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("tm")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("tn")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("tp")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("tc")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("td")
	static int[] field573;
	@ObfuscatedName("tb")
	@ObfuscatedSignature(
		descriptor = "[Lbu;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("to")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("uw")
	static boolean field648;
	@ObfuscatedName("ug")
	static boolean field738;
	@ObfuscatedName("ub")
	static boolean field760;
	@ObfuscatedName("um")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	static class521 field761;
	@ObfuscatedName("ud")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	static class520 field504;
	@ObfuscatedName("ut")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	static class520 field763;
	@ObfuscatedName("uv")
	static boolean field748;
	@ObfuscatedName("uo")
	static boolean[] field765;
	@ObfuscatedName("uf")
	static int[] field766;
	@ObfuscatedName("uz")
	static int[] field767;
	@ObfuscatedName("ua")
	static int[] field768;
	@ObfuscatedName("ui")
	static int[] field682;
	@ObfuscatedName("uk")
	static short field587;
	@ObfuscatedName("vb")
	static short field579;
	@ObfuscatedName("vn")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("vd")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("vf")
	static short field774;
	@ObfuscatedName("vi")
	static short field762;
	@ObfuscatedName("vy")
	static short field776;
	@ObfuscatedName("vo")
	static short field777;
	@ObfuscatedName("vu")
	@ObfuscatedGetter(
		intValue = -353471513
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("vr")
	@ObfuscatedGetter(
		intValue = 745799495
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("vw")
	@ObfuscatedGetter(
		intValue = -1725432169
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("vm")
	@ObfuscatedGetter(
		intValue = -1477308191
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("vl")
	@ObfuscatedGetter(
		intValue = 1706192477
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("vk")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("playerAppearance")
	static final PlayerComposition playerAppearance;
	@ObfuscatedName("vh")
	@ObfuscatedGetter(
		intValue = -1269400407
	)
	static int field784;
	@ObfuscatedName("vs")
	@ObfuscatedGetter(
		intValue = 946787671
	)
	static int field785;
	@ObfuscatedName("vg")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	static class517 field794;
	@ObfuscatedName("vj")
	@ObfuscatedSignature(
		descriptor = "[Lpj;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("vq")
	@ObfuscatedSignature(
		descriptor = "Lcx;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("vc")
	@ObfuscatedSignature(
		descriptor = "Lrs;"
	)
	static class465 field789;
	@ObfuscatedName("wk")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("DBTableIndex_cache")
	static EvictingDualNodeHashTable DBTableIndex_cache;
	@ObfuscatedName("wc")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("archive11")
	static EvictingDualNodeHashTable archive11;
	@ObfuscatedName("ww")
	@ObfuscatedGetter(
		intValue = 2061539989
	)
	static int field792;
	@ObfuscatedName("wp")
	@ObfuscatedGetter(
		intValue = -1918127199
	)
	public static int field800;
	@ObfuscatedName("wa")
	static List field798;
	@ObfuscatedName("gx")
	@Export("token")
	String token;
	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	@Export("asyncRestClient")
	AsyncRestClient asyncRestClient;
	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	@Export("asyncGameSessionTokenResponse")
	AsyncHttpResponse asyncGameSessionTokenResponse;
	@ObfuscatedName("gm")
	@Export("otlTokenRequester")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/OtlTokenRequester;"
	)
	OtlTokenRequester otlTokenRequester;
	@ObfuscatedName("go")
	@Export("otlTokenRequestFuture")
	Future otlTokenRequestFuture;
	@ObfuscatedName("gi")
	@Export("https")
	boolean https;
	@ObfuscatedName("gz")
	@ObfuscatedGetter(
		intValue = -1757084623
	)
	@Export("clientId")
	int clientId;
	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	@Export("asyncAccessTokenResponse")
	AsyncHttpResponse asyncAccessTokenResponse;
	@ObfuscatedName("gu")
	@Export("refreshAccessTokenRequester")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester refreshAccessTokenRequester;
	@ObfuscatedName("gt")
	@Export("refreshAccessTokenRequestFuture")
	Future refreshAccessTokenRequestFuture;
	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	Buffer field631;
	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	class7 field561;
	@ObfuscatedName("hv")
	@ObfuscatedGetter(
		longValue = 4829975363066786321L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field788 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		field537 = -1;
		clientType = -1;
		field508 = -1;
		onMobile = false;
		class555.field5457 = 226;
		field510 = false;
		field618 = false;
		gameState = 0;
		field513 = false;
		field596 = false;
		isLoading = true;
		cycle = 0;
		serverCycle = 0;
		mouseLastLastPressedTimeMillis = -1L;
		field706 = -1;
		field723 = -1;
		field522 = -1L;
		hadFocus = true;
		rebootTimer = 0;
		hintArrowType = 0;
		hintArrowNpcIndex = 0;
		hintArrowPlayerIndex = 0;
		hintArrowX = 0;
		hintArrowY = 0;
		hintArrowHeight = 0;
		hintArrowSubX = 0;
		hintArrowSubY = 0;
		playerAttackOption = AttackOption.AttackOption_hidden;
		npcAttackOption = AttackOption.AttackOption_hidden;
		z = false;
		field536 = class95.field1165;
		js5ConnectState = 0;
		field538 = 0;
		js5Errors = 0;
		field540 = 0;
		field541 = 0;
		field542 = 0;
		authenticationScheme = AuthenticationScheme.USERNAME_PASSWORD;
		field616 = class562.field5522;
		int var2 = "com_jagex_auth_desktop_osrs:public".length();
		byte[] var3 = new byte[var2];

		int var4;
		char var11;
		for (var4 = 0; var4 < var2; ++var4) {
			var11 = "com_jagex_auth_desktop_osrs:public".charAt(var4);
			if (var11 > 127) {
				var3[var4] = 63;
			} else {
				var3[var4] = (byte)var11;
			}
		}

		byte[] var10 = var3;
		var4 = var3.length;
		StringBuilder var5 = new StringBuilder();

		int var6;
		int var7;
		int var8;
		int var9;
		for (var6 = 0; var6 < var4 + 0; var6 += 3) {
			var7 = var10[var6] & 255;
			var5.append(class418.field4745[var7 >>> 2]);
			if (var6 < var4 - 1) {
				var8 = var10[var6 + 1] & 255;
				var5.append(class418.field4745[(var7 & 3) << 4 | var8 >>> 4]);
				if (var6 < var4 - 2) {
					var9 = var10[var6 + 2] & 255;
					var5.append(class418.field4745[(var8 & 15) << 2 | var9 >>> 6]).append(class418.field4745[var9 & 63]);
				} else {
					var5.append(class418.field4745[(var8 & 15) << 2]).append("=");
				}
			} else {
				var5.append(class418.field4745[(var7 & 3) << 4]).append("==");
			}
		}

		String var12 = var5.toString();
		BASIC_AUTH_DESKTOP_OSRS = var12;
		var2 = "com_jagex_auth_desktop_runelite:public".length();
		var3 = new byte[var2];

		for (var4 = 0; var4 < var2; ++var4) {
			var11 = "com_jagex_auth_desktop_runelite:public".charAt(var4);
			if (var11 > 127) {
				var3[var4] = 63;
			} else {
				var3[var4] = (byte)var11;
			}
		}

		var10 = var3;
		var4 = var3.length;
		var5 = new StringBuilder();

		for (var6 = 0; var6 < var4 + 0; var6 += 3) {
			var7 = var10[var6] & 255;
			var5.append(class418.field4745[var7 >>> 2]);
			if (var6 < var4 - 1) {
				var8 = var10[var6 + 1] & 255;
				var5.append(class418.field4745[(var7 & 3) << 4 | var8 >>> 4]);
				if (var6 < var4 - 2) {
					var9 = var10[var6 + 2] & 255;
					var5.append(class418.field4745[(var8 & 15) << 2 | var9 >>> 6]).append(class418.field4745[var9 & 63]);
				} else {
					var5.append(class418.field4745[(var8 & 15) << 2]).append("=");
				}
			} else {
				var5.append(class418.field4745[(var7 & 3) << 4]).append("==");
			}
		}

		var12 = var5.toString();
		BASIC_AUTH_DESKTOP_RUNELITE = var12;
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		field559 = new int[4];
		randomDatData = null;
		npcCount = 0;
		npcIndices = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		hadNetworkError = false;
		timer = new Timer();
		fontsMap = new HashMap();
		field653 = 0;
		field572 = 1;
		field571 = 0;
		field574 = 1;
		field514 = 0;
		field576 = new int[4][13][13];
		worldViewManager = new WorldViewManager();
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field580 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field734 = -1;
		playerUpdateManager = new PlayerUpdateManager();
		graphicsCycle = 0;
		field584 = 2301979;
		field678 = 5063219;
		field714 = 3353893;
		field556 = 7759444;
		field588 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field598 = 0;
		field546 = 0;
		field600 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		revision = 0;
		field786 = false;
		field605 = 0;
		field606 = false;
		field607 = 0;
		overheadTextCount = 0;
		overheadTextLimit = 50;
		overheadTextXs = new int[overheadTextLimit];
		overheadTextYs = new int[overheadTextLimit];
		overheadTextAscents = new int[overheadTextLimit];
		overheadTextXOffsets = new int[overheadTextLimit];
		overheadTextColors = new int[overheadTextLimit];
		overheadTextEffects = new int[overheadTextLimit];
		field665 = new int[overheadTextLimit][];
		overheadTextCyclesRemaining = new int[overheadTextLimit];
		overheadText = new String[overheadTextLimit];
		viewportDrawCount = 0;
		viewportTempX = -1;
		viewportTempY = -1;
		mouseCrossX = 0;
		mouseCrossY = 0;
		mouseCrossState = 0;
		mouseCrossColor = 0;
		showMouseCross = true;
		field627 = 0;
		showLoadingMessages = true;
		localPlayerIndex = -1;
		field630 = 0;
		userId = -1L;
		userHash = -1L;
		field633 = "";
		field520 = -1;
		renderSelf = true;
		drawPlayerNames = 0;
		field637 = 0;
		field638 = new int[1000];
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		playerMenuActions = new String[8];
		playerOptionsPriorities = new boolean[8];
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		combatTargetPlayerIndex = -1;
		currentLevels = new int[25];
		levels = new int[25];
		experience = new int[25];
		field647 = new int[25];
		leftClickOpensMenu = false;
		isMenuOpen = false;
		menu = new Menu(true);
		followerOpsLowPriority = false;
		tapToDrop = false;
		showMouseOverText = true;
		viewportX = -1;
		viewportY = -1;
		field544 = 0;
		field657 = 50;
		isItemSelected = 0;
		field659 = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		selectedSpellItemId = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field667 = 0;
		field668 = -1;
		chatEffects = 0;
		meslayerContinueWidget = null;
		runEnergy = 0;
		weight = 0;
		staffModLevel = 0;
		followerIndex = -1;
		playerMod = false;
		viewportWidget = null;
		clickedWidget = null;
		clickedWidgetParent = null;
		widgetClickX = 0;
		widgetClickY = 0;
		draggedOnWidget = null;
		field558 = false;
		field758 = -1;
		field684 = -1;
		field691 = false;
		field686 = -1;
		field521 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		field778 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field696 = new int[32];
		field697 = 0;
		chatCycle = 0;
		field586 = 0;
		field700 = 0;
		field701 = 0;
		field702 = 0;
		field703 = 0;
		field704 = 0;
		field705 = 0;
		mouseWheelRotation = 0;
		field707 = new class575();
		scriptEvents = new NodeDeque();
		scriptEvents2 = new NodeDeque();
		scriptEvents3 = new NodeDeque();
		field711 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field590 = -2;
		validRootWidgets = new boolean[100];
		field716 = new boolean[100];
		field717 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field772 = 0L;
		isResizable = true;
		field725 = 600;
		field726 = field725 / GameEngine.cycleDurationMillis;
		field771 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field730 = "";
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		indexCheck = new IndexCheck();
		field754 = new class267();
		field735 = 0;
		field736 = new int[128];
		field737 = new int[128];
		field709 = -1L;
		currentClanSettings = new ClanSettings[4];
		currentClanChannels = new ClanChannel[4];
		field578 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		minimapState = 0;
		playingJingle = false;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		field573 = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field648 = false;
		field738 = false;
		field760 = false;
		field761 = null;
		field504 = null;
		field763 = null;
		field748 = false;
		field765 = new boolean[5];
		field766 = new int[5];
		field767 = new int[5];
		field768 = new int[5];
		field682 = new int[5];
		field587 = 256;
		field579 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field774 = 1;
		field762 = 32767;
		field776 = 1;
		field777 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field784 = -1;
		field785 = -1;
		field794 = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field789 = new class465(8, class463.field4960);
		DBTableIndex_cache = new EvictingDualNodeHashTable(64);
		archive11 = new EvictingDualNodeHashTable(64);
		field792 = -1;
		field800 = -1;
		field798 = new ArrayList();
		field795 = new class277();
		field507 = 30;
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field741 = 0;
		field769 = new ApproximateRouteStrategy();
		field801 = new int[50];
		field506 = new int[50];
	}

	public Client() {
		this.https = false;
		this.clientId = 0;
		this.accountHash = -1L;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-586512412"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field772 = class77.method2338() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.method1334(true);
		}

	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "109"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000};
		int[] var2 = new int[]{1000, 100, 500};
		if (var1 != null && var2 != null) {
			DbTableType.ByteArrayPool_alternativeSizes = var1;
			HttpResponse.ByteArrayPool_altSizeArrayCounts = new int[var1.length];
			ByteArrayPool.ByteArrayPool_arrays = new byte[var1.length][][];

			for (int var3 = 0; var3 < DbTableType.ByteArrayPool_alternativeSizes.length; ++var3) {
				ByteArrayPool.ByteArrayPool_arrays[var3] = new byte[var2[var3]][];
				ByteArrayPool.field4902.add(var1[var3]);
			}

			Collections.sort(ByteArrayPool.field4902);
		} else {
			DbTableType.ByteArrayPool_alternativeSizes = null;
			HttpResponse.ByteArrayPool_altSizeArrayCounts = null;
			ByteArrayPool.ByteArrayPool_arrays = null;
			class326.method6529();
		}

		int var4 = worldProperties;
		class552 var5 = class552.field5430;
		boolean var15 = (var4 & var5.rsOrdinal()) != 0;
		field719 = var15;
		GameEngine.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		SwapSongTask.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		HorizontalAlignment.currentPort = GameEngine.worldPort;
		ArchiveDiskActionHandler.field4539 = class360.field3863;
		class190.field1981 = class360.field3864;
		class75.field902 = class360.field3865;
		class340.field3707 = class360.field3867;
		class278.urlRequester = new SecureUrlRequester(this.https, 226);
		this.setUpKeyboard();
		this.setUpMouse();
		class159.mouseWheel = this.mouseWheel();
		this.method575(field754, 0);
		this.method575(indexCheck, 1);
		this.setUpClipboard();
		WorldMapElement.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		AccessFile var7 = null;
		ClientPreferences var8 = new ClientPreferences();

		try {
			var7 = IgnoreList.getPreferencesFile("", WorldMapRenderer.field3156.name, false);
			byte[] var9 = new byte[(int)var7.length()];

			int var11;
			for (int var10 = 0; var10 < var9.length; var10 += var11) {
				var11 = var7.read(var9, var10, var9.length - var10);
				if (var11 == -1) {
					throw new IOException();
				}
			}

			var8 = new ClientPreferences(new Buffer(var9));
		} catch (Exception var14) {
		}

		try {
			if (var7 != null) {
				var7.close();
			}
		} catch (Exception var13) {
		}

		TaskHandler.clientPreferences = var8;
		String var16 = class271.field3018;
		class31.field135 = this;
		if (var16 != null) {
			class31.field134 = var16;
		}

		MusicPatchPcmStream.setWindowedMode(TaskHandler.clientPreferences.getWindowMode());
		ItemContainer.friendSystem = new FriendSystem(WorldMapScaleHandler.loginType);
		this.asyncRestClient = new AsyncRestClient("tokenRequest", 1, 1);
		if (!class333.field3627.contains(this)) {
			class333.field3627.add(this);
		}

		field795.method5820();
		ModelData var12 = new ModelData(3, 1, 0);
		var12.method4688(-64, -8, 64);
		var12.method4688(64, -8, 64);
		var12.method4688(0, -8, -24);
		var12.method4689(0, 2, 1, (byte)1, (byte)-1, (short)-1, (short)-1);
		GameObject.field2972 = var12.toModel(128, 256, 0, -128, 0);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-680789048"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();

		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
			}

			if (var1 == null) {
				boolean var4 = ItemLayer.method4678();
				if (var4 && playingJingle && DynamicObject.pcmPlayer1 != null) {
					DynamicObject.pcmPlayer1.tryDiscard();
				}

				class149.method3569();
				indexCheck.method5649();
				this.method500();
				class106.method3031();
				if (class159.mouseWheel != null) {
					int var5 = class159.mouseWheel.useRotation();
					mouseWheelRotation = var5;
				}

				if (gameState == 0) {
					WorldMapIcon_1.method5888();
					ClanChannel.method3806();
				} else if (gameState == 5) {
					AbstractByteArrayCopier.loginScreen(this, class224.fontPlain11, UserComparator6.fontPlain12);
					WorldMapIcon_1.method5888();
					ClanChannel.method3806();
				} else if (gameState != 10 && gameState != 11) {
					if (gameState == 20) {
						AbstractByteArrayCopier.loginScreen(this, class224.fontPlain11, UserComparator6.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 50) {
						AbstractByteArrayCopier.loginScreen(this, class224.fontPlain11, UserComparator6.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 25) {
						if (field510) {
							class445.loadRegion();
						}

						if (field618) {
							class88.method2558(VarbitComposition.field2124);
						}

						if (!field618 && !field510) {
							BuddyRankComparator.updateGameState(30);
						}
					}
				} else {
					AbstractByteArrayCopier.loginScreen(this, class224.fontPlain11, UserComparator6.fontPlain12);
				}

				if (gameState == 30) {
					this.doCycleLoggedIn();
				} else if (gameState == 40 || gameState == 45) {
					this.doCycleLoggedOut();
				}

				return;
			}

			var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false);
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2088333438"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field772 && class77.method2338() > field772) {
			MusicPatchPcmStream.setWindowedMode(LoginPacket.getWindowedMode());
		}

		int var2;
		if (var1) {
			for (var2 = 0; var2 < 100; ++var2) {
				validRootWidgets[var2] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1, MilliClock.field2402);
		} else if (gameState == 5) {
			DynamicObject.drawTitle(Calendar.fontBold12, class224.fontPlain11, UserComparator6.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				DynamicObject.drawTitle(Calendar.fontBold12, class224.fontPlain11, UserComparator6.fontPlain12);
			} else if (gameState == 50) {
				DynamicObject.drawTitle(Calendar.fontBold12, class224.fontPlain11, UserComparator6.fontPlain12);
			} else if (gameState == 25) {
				if (field514 == 1) {
					if (field653 > field572) {
						field572 = field653;
					}

					var2 = (field572 * 50 - field653 * 50) / field572;
					ObjectComposition.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else if (field514 == 2) {
					if (field571 > field574) {
						field574 = field571;
					}

					var2 = (field574 * 50 - field571 * 50) / field574 + 50;
					ObjectComposition.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else {
					ObjectComposition.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				ObjectComposition.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				ObjectComposition.drawLoadingMessage("Please wait...", false);
			}
		} else {
			DynamicObject.drawTitle(Calendar.fontBold12, class224.fontPlain11, UserComparator6.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				if (field716[var2]) {
					class213.rasterProvider.draw(rootWidgetXs[var2], rootWidgetYs[var2], rootWidgetWidths[var2], rootWidgetHeights[var2]);
					field716[var2] = false;
				}
			}
		} else if (gameState > 0) {
			class213.rasterProvider.drawFull(0, 0);

			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				field716[var2] = false;
			}
		}

	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1821954389"
	)
	@Export("kill0")
	protected final void kill0() {
		if (class508.varcs != null && class508.varcs.hasUnwrittenChanges()) {
			class508.varcs.write();
		}

		if (IgnoreList.mouseRecorder != null) {
			IgnoreList.mouseRecorder.isRunning = false;
		}

		IgnoreList.mouseRecorder = null;
		packetWriter.close();
		class323.method6517();
		class159.mouseWheel = null;
		if (DynamicObject.pcmPlayer1 != null) {
			DynamicObject.pcmPlayer1.shutdown();
		}

		class376.field4123.method7714();
		class139.method3489();
		if (class278.urlRequester != null) {
			class278.urlRequester.close();
			class278.urlRequester = null;
		}

		AsyncRestClient.method178();
		this.asyncRestClient.shutdown();
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "888034615"
	)
	protected final void vmethod1299() {
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	@Export("isRuneLite")
	boolean isRuneLite() {
		return this.clientId == 1;
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("containsAccessAndRefreshToken")
	boolean containsAccessAndRefreshToken() {
		return Skeleton.accessToken != null && !Skeleton.accessToken.trim().isEmpty() && WorldMapID.refreshToken != null && !WorldMapID.refreshToken.trim().isEmpty();
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "10119"
	)
	@Export("containsSessionAndCharacterId")
	boolean containsSessionAndCharacterId() {
		return WorldMapArea.sessionId != null && !WorldMapArea.sessionId.trim().isEmpty() && ByteArrayPool.characterId != null && !ByteArrayPool.characterId.trim().isEmpty();
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "270739447"
	)
	@Export("otlTokenRequesterInitialized")
	boolean otlTokenRequesterInitialized() {
		return this.otlTokenRequester != null;
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-172309006"
	)
	@Export("requestRefreshAccessToken")
	void requestRefreshAccessToken(String var1) throws IOException {
		HashMap var2 = new HashMap();
		var2.put("grant_type", "refresh_token");
		var2.put("scope", "gamesso.token.create");
		var2.put("refresh_token", var1);
		URL var3 = new URL(StudioGame.authServiceBaseUrl + "shield/oauth/token" + (new HttpQueryParams(var2)).encode());
		HttpHeaders var4 = new HttpHeaders();
		if (this.isRuneLite()) {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_RUNELITE);
		} else {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_OSRS);
		}

		var4.header("Host", (new URL(StudioGame.authServiceBaseUrl)).getHost());
		var4.accept(HttpContentType.APPLICATION_JSON);
		HttpMethod var5 = HttpMethod.POST;
		RefreshAccessTokenRequester var6 = this.refreshAccessTokenRequester;
		if (var6 != null) {
			this.refreshAccessTokenRequestFuture = var6.request(var5.getName(), var3, var4.getHeaders(), "");
		} else {
			HttpRequest var7 = new HttpRequest(var3, var5, var4, this.https);
			this.asyncAccessTokenResponse = this.asyncRestClient.submitRequest(var7);
		}
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1132419001"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		URL var2 = new URL(StudioGame.authServiceBaseUrl + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
		HttpHeaders var3 = new HttpHeaders();
		var3.bearerToken(var1);
		HttpMethod var4 = HttpMethod.GET;
		OtlTokenRequester var5 = this.otlTokenRequester;
		if (var5 != null) {
			this.otlTokenRequestFuture = var5.request(var4.getName(), var2, var3.getHeaders(), "");
		} else {
			HttpRequest var6 = new HttpRequest(var2, var4, var3, this.https);
			this.asyncGameSessionTokenResponse = this.asyncRestClient.submitRequest(var6);
		}
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-42099544"
	)
	@Export("authenticate")
	void authenticate(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(class149.gameSessionServiceBaseUrl + "game-session/v1/tokens");
		HttpRequest var4 = new HttpRequest(var3, HttpMethod.POST, this.https);
		var4.getHeaders().bearerToken(var1);
		var4.getHeaders().accept(HttpContentType.APPLICATION_JSON);
		JSONObject var5 = new JSONObject();
		var5.setProperty("accountId", var2);
		var4.setPayload(new HttpJsonRequestBody(var5));
		this.asyncGameSessionTokenResponse = this.asyncRestClient.submitRequest(var4);
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1881757885"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			boolean var1 = class376.field4123.method7705();
			if (!var1) {
				this.method1316();
			}

		}
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "357623586"
	)
	void method1316() {
		if (class376.field4123.field4631 >= 4) {
			this.error("js5crc");
			BuddyRankComparator.updateGameState(1000);
		} else {
			if (class376.field4123.field4632 >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					BuddyRankComparator.updateGameState(1000);
					return;
				}

				field538 = 3000;
				class376.field4123.field4632 = 3;
			}

			if (--field538 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						class202.js5SocketTask = GameEngine.taskHandler.newSocketTask(class156.worldHost, HorizontalAlignment.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (class202.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (class202.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						class191.js5Socket = AsyncHttpResponse.method281((Socket)class202.js5SocketTask.result, 40000, 5000);
						Buffer var1;
						if (class555.field5457 >= 223) {
							var1 = new Buffer(class326.field3584.field3592 + 1);
							var1.writeByte(class326.field3584.field3591);
							var1.writeInt(226);
							var1.writeInt(field559[0]);
							var1.writeInt(field559[1]);
							var1.writeInt(field559[2]);
							var1.writeInt(field559[3]);
							class191.js5Socket.write(var1.array, 0, class326.field3584.field3592 + 1);
						} else {
							var1 = new Buffer(5);
							var1.writeByte(class326.field3584.field3591);
							var1.writeInt(226);
							class191.js5Socket.write(var1.array, 0, 5);
						}

						++js5ConnectState;
						WorldMapEvent.field3284 = class77.method2338();
					}

					if (js5ConnectState == 3) {
						if (class191.js5Socket.available() > 0) {
							int var2 = class191.js5Socket.readUnsignedByte();
							if (var2 != 0) {
								this.js5Error(var2);
								return;
							}

							++js5ConnectState;
						} else if (class77.method2338() - WorldMapEvent.field3284 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						class376.field4123.method7707(class191.js5Socket, gameState > 20);
						class202.js5SocketTask = null;
						class191.js5Socket = null;
						js5ConnectState = 0;
						js5Errors = 0;
					}
				} catch (IOException var3) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1856888773"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class202.js5SocketTask = null;
		class191.js5Socket = null;
		js5ConnectState = 0;
		if (HorizontalAlignment.currentPort == GameEngine.worldPort) {
			HorizontalAlignment.currentPort = SwapSongTask.js5Port;
		} else {
			HorizontalAlignment.currentPort = GameEngine.worldPort;
		}

		++js5Errors;
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
			if (gameState <= 5) {
				this.error("js5connect_full");
				BuddyRankComparator.updateGameState(1000);
			} else {
				field538 = 3000;
			}
		} else if (js5Errors >= 2 && var1 == 6) {
			this.error("js5connect_outofdate");
			BuddyRankComparator.updateGameState(1000);
		} else if (js5Errors >= 4) {
			if (gameState <= 5) {
				this.error("js5connect");
				BuddyRankComparator.updateGameState(1000);
			} else {
				field538 = 3000;
			}
		}

	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-105"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (class346.loginState == LoginState.SHUTDOWN_PREVIOUS_CONNECTION) {
				if (PacketBufferNode.field3435 == null && (secureRandomFuture.isDone() || field540 > 250)) {
					PacketBufferNode.field3435 = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (PacketBufferNode.field3435 != null) {
					if (var1 != null) {
						((AbstractSocket)var1).close();
						var1 = null;
					}

					class278.field3064 = null;
					hadNetworkError = false;
					field540 = 0;
					if (field616.method10413()) {
						if (this.containsAccessAndRefreshToken()) {
							try {
								this.requestRefreshAccessToken(WorldMapID.refreshToken);
								class153.updateLoginState(LoginState.TOKEN_RESPONSE);
							} catch (Throwable var22) {
								HttpHeaders.RunException_sendStackTrace((String)null, var22);
								SecureUrlRequester.getLoginError(65);
								return;
							}
						} else {
							if (!this.containsSessionAndCharacterId()) {
								SecureUrlRequester.getLoginError(65);
								return;
							}

							try {
								this.authenticate(WorldMapArea.sessionId, ByteArrayPool.characterId);
								class153.updateLoginState(LoginState.REFRESHING_TOKEN);
							} catch (Exception var21) {
								HttpHeaders.RunException_sendStackTrace((String)null, var21);
								SecureUrlRequester.getLoginError(65);
								return;
							}
						}
					} else {
						class153.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
					}
				}
			}

			HttpResponse var24;
			if (class346.loginState == LoginState.TOKEN_RESPONSE) {
				if (this.refreshAccessTokenRequestFuture != null) {
					if (!this.refreshAccessTokenRequestFuture.isDone()) {
						return;
					}

					if (this.refreshAccessTokenRequestFuture.isCancelled()) {
						SecureUrlRequester.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.refreshAccessTokenRequestFuture.get();
						if (!var3.isSuccess()) {
							SecureUrlRequester.getLoginError(65);
							this.refreshAccessTokenRequestFuture = null;
							return;
						}

						Skeleton.accessToken = var3.getAccessToken();
						WorldMapID.refreshToken = var3.getRefreshToken();
						this.refreshAccessTokenRequestFuture = null;
					} catch (Exception var20) {
						HttpHeaders.RunException_sendStackTrace((String)null, var20);
						SecureUrlRequester.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncAccessTokenResponse == null) {
						SecureUrlRequester.getLoginError(65);
						return;
					}

					if (!this.asyncAccessTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncAccessTokenResponse.hasError()) {
						HttpHeaders.RunException_sendStackTrace(this.asyncAccessTokenResponse.getErrorMessage(), (Throwable)null);
						SecureUrlRequester.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					var24 = this.asyncAccessTokenResponse.await();
					if (var24.getResponseCode() != 200) {
						SecureUrlRequester.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					field540 = 0;
					HttpJsonRequestBody var4 = new HttpJsonRequestBody(var24.getResponseBody());

					try {
						Skeleton.accessToken = var4.getBody().getString("access_token");
						WorldMapID.refreshToken = var4.getBody().getString("refresh_token");
					} catch (Exception var19) {
						HttpHeaders.RunException_sendStackTrace("Error parsing tokens", var19);
						SecureUrlRequester.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}
				}

				this.requestOtlToken(Skeleton.accessToken);
				class153.updateLoginState(LoginState.REFRESHING_TOKEN);
			}

			if (LoginState.REFRESHING_TOKEN == class346.loginState) {
				if (this.otlTokenRequestFuture != null) {
					if (!this.otlTokenRequestFuture.isDone()) {
						return;
					}

					if (this.otlTokenRequestFuture.isCancelled()) {
						SecureUrlRequester.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}

					try {
						OtlTokenResponse var25 = (OtlTokenResponse)this.otlTokenRequestFuture.get();
						if (!var25.isSuccess()) {
							SecureUrlRequester.getLoginError(65);
							this.otlTokenRequestFuture = null;
							return;
						}

						this.token = var25.getToken();
						this.otlTokenRequestFuture = null;
					} catch (Exception var18) {
						HttpHeaders.RunException_sendStackTrace((String)null, var18);
						SecureUrlRequester.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncGameSessionTokenResponse == null) {
						SecureUrlRequester.getLoginError(65);
						return;
					}

					if (!this.asyncGameSessionTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncGameSessionTokenResponse.hasError()) {
						HttpHeaders.RunException_sendStackTrace(this.asyncGameSessionTokenResponse.getErrorMessage(), (Throwable)null);
						SecureUrlRequester.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					var24 = this.asyncGameSessionTokenResponse.await();
					if (var24.getResponseCode() != 200) {
						HttpHeaders.RunException_sendStackTrace("Login authentication error. Response code: " + var24.getResponseCode() + " " + var24.method293() + " Response body: " + var24.getResponseBody(), (Throwable)null);
						SecureUrlRequester.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					List var27 = (List)var24.getHeaderFields().get("Content-Type");
					if (var27 != null && var27.contains(HttpContentType.APPLICATION_JSON.getValue())) {
						try {
							JSONObject var5 = new JSONObject(var24.getResponseBody());
							this.token = var5.getString("token");
						} catch (JSONException var17) {
							HttpHeaders.RunException_sendStackTrace((String)null, var17);
							SecureUrlRequester.getLoginError(65);
							this.asyncGameSessionTokenResponse = null;
							return;
						}
					} else {
						this.token = var24.getResponseBody();
					}

					this.asyncGameSessionTokenResponse = null;
				}

				field540 = 0;
				class153.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
			}

			if (class346.loginState == LoginState.INIT_MOUSEHANDLER_SOCKET) {
				if (class278.field3064 == null) {
					class278.field3064 = GameEngine.taskHandler.newSocketTask(class156.worldHost, HorizontalAlignment.currentPort);
				}

				if (class278.field3064.status == 2) {
					throw new IOException();
				}

				if (class278.field3064.status == 1) {
					Socket var29 = (Socket)class278.field3064.result;
					BufferedNetSocket var26 = new BufferedNetSocket(var29, 40000, 5000);
					var1 = var26;
					packetWriter.setSocket(var26);
					class278.field3064 = null;
					class153.updateLoginState(LoginState.UNMAPPED_20);
				}
			}

			PacketBufferNode var28;
			if (class346.loginState == LoginState.UNMAPPED_20) {
				packetWriter.clearBuffer();
				var28 = class323.method6516();
				var28.packetBuffer.writeByte(class326.field3587.field3591);
				packetWriter.addNode(var28);
				packetWriter.flush();
				var2.offset = 0;
				class153.updateLoginState(LoginState.READ_LOGIN_STATUS);
			}

			int var13;
			if (class346.loginState == LoginState.READ_LOGIN_STATUS) {
				if (DynamicObject.pcmPlayer1 != null) {
					DynamicObject.pcmPlayer1.method785();
				}

				if (((AbstractSocket)var1).isAvailable(1)) {
					var13 = ((AbstractSocket)var1).readUnsignedByte();
					if (DynamicObject.pcmPlayer1 != null) {
						DynamicObject.pcmPlayer1.method785();
					}

					if (var13 != 0) {
						SecureUrlRequester.getLoginError(var13);
						return;
					}

					var2.offset = 0;
					class153.updateLoginState(LoginState.READ_RANDOM_VERIFICATION_NUMBER);
				}
			}

			if (LoginState.READ_RANDOM_VERIFICATION_NUMBER == class346.loginState) {
				if (var2.offset < 8) {
					var13 = ((AbstractSocket)var1).available();
					if (var13 > 8 - var2.offset) {
						var13 = 8 - var2.offset;
					}

					if (var13 > 0) {
						((AbstractSocket)var1).read(var2.array, var2.offset, var13);
						var2.offset += var13;
					}
				}

				if (var2.offset == 8) {
					var2.offset = 0;
					InterfaceParent.field1094 = var2.readLong();
					class153.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}
			}

			if (LoginState.WRITE_INITIAL_LOGIN_PACKET == class346.loginState) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var30 = new PacketBuffer(500);
				int[] var31 = new int[]{PacketBufferNode.field3435.nextInt(), PacketBufferNode.field3435.nextInt(), PacketBufferNode.field3435.nextInt(), PacketBufferNode.field3435.nextInt()};
				var30.offset = 0;
				var30.writeByte(1);
				var30.writeInt(var31[0]);
				var30.writeInt(var31[1]);
				var30.writeInt(var31[2]);
				var30.writeInt(var31[3]);
				var30.writeLong(InterfaceParent.field1094);
				if (gameState == 40) {
					var30.writeInt(field559[0]);
					var30.writeInt(field559[1]);
					var30.writeInt(field559[2]);
					var30.writeInt(field559[3]);
				} else {
					if (gameState == 50) {
						var30.writeByte(AuthenticationScheme.field1531.rsOrdinal());
						var30.writeInt(class197.field2064);
					} else {
						var30.writeByte(authenticationScheme.rsOrdinal());
						switch(authenticationScheme.schemeId) {
						case 1:
							var30.writeInt(TaskHandler.clientPreferences.getParameterValue(Login.Login_username));
							break;
						case 2:
						case 4:
							var30.writeMedium(class333.otpMedium);
							++var30.offset;
							break;
						case 3:
							var30.offset += 4;
						}
					}

					if (field616.method10413()) {
						var30.writeByte(class562.field5517.rsOrdinal());
						var30.writeStringCp1252NullTerminated(this.token);
					} else {
						var30.writeByte(class562.field5522.rsOrdinal());
						var30.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var30.encryptRsa(class77.field920, class77.field924);
				field559 = var31;
				PacketBufferNode var32 = class323.method6516();
				var32.packetBuffer.offset = 0;
				if (gameState == 40) {
					var32.packetBuffer.writeByte(class326.field3585.field3591);
				} else {
					var32.packetBuffer.writeByte(class326.field3588.field3591);
				}

				var32.packetBuffer.writeShort(0);
				int var6 = var32.packetBuffer.offset;
				var32.packetBuffer.writeInt(226);
				var32.packetBuffer.writeInt(1);
				var32.packetBuffer.writeByte(clientType);
				var32.packetBuffer.writeByte(field508);
				byte var7 = 0;
				var32.packetBuffer.writeByte(var7);
				var32.packetBuffer.writeBytes(var30.array, 0, var30.offset);
				int var8 = var32.packetBuffer.offset;
				var32.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var32.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var32.packetBuffer.writeShort(HttpRequestTask.canvasWidth);
				var32.packetBuffer.writeShort(class268.canvasHeight);
				PacketBuffer var9 = var32.packetBuffer;
				if (randomDatData != null) {
					var9.writeBytes(randomDatData, 0, randomDatData.length);
				} else {
					byte[] var10 = class1.randomDatData2();
					var9.writeBytes(var10, 0, var10.length);
				}

				var32.packetBuffer.writeStringCp1252NullTerminated(class145.field1668);
				var32.packetBuffer.writeInt(BZip2State.field5507);
				var32.packetBuffer.writeByte(0);
				Buffer var40 = new Buffer(AuthenticationScheme.platformInfo.size());
				AuthenticationScheme.platformInfo.write(var40);
				var32.packetBuffer.writeBytes(var40.array, 0, var40.array.length);
				var32.packetBuffer.writeByte(clientType);
				var32.packetBuffer.writeInt(0);
				if (field719) {
					class140.method3495(var32);
				} else {
					AsyncHttpResponse.method279(var32);
				}

				var32.packetBuffer.xteaEncrypt(var31, var8, var32.packetBuffer.offset);
				var32.packetBuffer.writeLengthShort(var32.packetBuffer.offset - var6);
				packetWriter.addNode(var32);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var31);
				int[] var11 = new int[4];

				for (int var12 = 0; var12 < 4; ++var12) {
					var11[var12] = var31[var12] + 50;
				}

				var2.newIsaacCipher(var11);
				class153.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			int var14;
			if (LoginState.READ_CLIENT_INFO_STATUS == class346.loginState && ((AbstractSocket)var1).available() > 0) {
				var13 = ((AbstractSocket)var1).readUnsignedByte();
				if (var13 == 61) {
					var14 = ((AbstractSocket)var1).available();
					class417.field4741 = var14 == 1 && ((AbstractSocket)var1).readUnsignedByte() == 1;
					class153.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}

				if (var13 == 21 && gameState == 20) {
					class153.updateLoginState(LoginState.READ_PROFILE_TRANSFER_TIME);
				} else if (var13 == 2) {
					if (field719) {
						class153.updateLoginState(LoginState.UNMAPPED_21);
					} else {
						class153.updateLoginState(LoginState.UNMAPPED);
					}
				} else if (var13 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					class153.updateLoginState(LoginState.UNMAPPED_19);
				} else if (var13 == 64) {
					class153.updateLoginState(LoginState.READ_STATE_11_PACKET_SIZE);
				} else if (var13 == 23 && field541 < 1) {
					++field541;
					class153.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				} else if (var13 == 29) {
					class153.updateLoginState(LoginState.UNMAPPED_17);
				} else {
					if (var13 != 69) {
						SecureUrlRequester.getLoginError(var13);
						return;
					}

					class153.updateLoginState(LoginState.READ_DIGEST_PARSER_PACKET_SIZE);
				}
			}

			if (class346.loginState == LoginState.UNMAPPED_21) {
				MilliClock.field2402 = true;
				class434.method8371(class95.field1166);
				BuddyRankComparator.updateGameState(0);
			}

			if (class346.loginState == LoginState.READ_DIGEST_PARSER_PACKET_SIZE && ((AbstractSocket)var1).available() >= 2) {
				((AbstractSocket)var1).read(var2.array, 0, 2);
				var2.offset = 0;
				UserComparator9.field1515 = var2.readUnsignedShort();
				class153.updateLoginState(LoginState.SUBMIT_DIGEST_PARSER_TASK);
			}

			if (class346.loginState == LoginState.SUBMIT_DIGEST_PARSER_TASK && ((AbstractSocket)var1).available() >= UserComparator9.field1515) {
				var2.offset = 0;
				((AbstractSocket)var1).read(var2.array, var2.offset, UserComparator9.field1515);
				class6 var33 = UrlRequester.method3230()[var2.readUnsignedByte()];

				try {
					switch(var33.field12) {
					case 0:
						class0 var34 = new class0();
						this.field561 = new class7(var2, var34);
						class153.updateLoginState(LoginState.WRITE_DIGEST_PARSER_RESULT);
						break;
					default:
						throw new IllegalArgumentException();
					}
				} catch (Exception var16) {
					SecureUrlRequester.getLoginError(22);
					return;
				}
			}

			if (LoginState.WRITE_DIGEST_PARSER_RESULT == class346.loginState && this.field561.method46()) {
				this.field631 = this.field561.method45();
				this.field561.method47();
				this.field561 = null;
				if (this.field631 == null) {
					SecureUrlRequester.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var28 = class323.method6516();
				var28.packetBuffer.writeByte(class326.field3590.field3591);
				var28.packetBuffer.writeShort(this.field631.offset);
				var28.packetBuffer.writeBuffer(this.field631);
				packetWriter.addNode(var28);
				packetWriter.flush();
				this.field631 = null;
				class153.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (LoginState.READ_STATE_11_PACKET_SIZE == class346.loginState && ((AbstractSocket)var1).available() > 0) {
				class319.field3304 = ((AbstractSocket)var1).readUnsignedByte();
				class153.updateLoginState(LoginState.UNMAPPED_11);
			}

			if (class346.loginState == LoginState.UNMAPPED_11 && ((AbstractSocket)var1).available() >= class319.field3304) {
				((AbstractSocket)var1).read(var2.array, 0, class319.field3304);
				var2.offset = 0;
				class153.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (class346.loginState == LoginState.READ_PROFILE_TRANSFER_TIME && ((AbstractSocket)var1).available() > 0) {
				field542 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60;
				class153.updateLoginState(LoginState.PROFILE_TRANSFER);
			}

			if (class346.loginState == LoginState.PROFILE_TRANSFER) {
				field540 = 0;
				class132.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field542 / 60 + " seconds.");
				if (--field542 <= 0) {
					class153.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				}

			} else if (LoginState.READ_ACCOUNT_INFO_PACKET_SIZE == class346.loginState) {
				var28 = class323.method6516();
				var28.packetBuffer.writeByte(class326.field3586.field3591);
				var28.packetBuffer.writeShort(class326.field3586.field3592);
				var28.packetBuffer.writeIntIME(FileSystem.field2400.hash);
				var28.packetBuffer.writeIntME(EnumComposition.archive9.hash);
				var28.packetBuffer.writeIntLE(class195.field2054.hash);
				var28.packetBuffer.writeIntME(UrlRequester.field1491.hash);
				var28.packetBuffer.writeInt(class1.archive12.hash);
				var28.packetBuffer.writeIntLE(ModeWhere.field4720.hash);
				var28.packetBuffer.writeInt(0);
				var28.packetBuffer.writeIntIME(Clock.field2468.hash);
				var28.packetBuffer.writeIntME(Sound.field1746.hash);
				var28.packetBuffer.writeInt(WorldMapRegion.archive4.hash);
				var28.packetBuffer.writeIntIME(class156.field1737.hash);
				var28.packetBuffer.writeIntIME(PlayerComposition.field3818.hash);
				var28.packetBuffer.writeIntLE(class59.archive2.hash);
				var28.packetBuffer.writeIntIME(class171.field1849.hash);
				packetWriter.addNode(var28);
				packetWriter.flush();
				class153.updateLoginState(LoginState.UNMAPPED);
			} else {
				if (LoginState.UNMAPPED == class346.loginState && ((AbstractSocket)var1).available() >= 1) {
					class145.field1666 = ((AbstractSocket)var1).readUnsignedByte();
					if (class145.field1666 != class326.field3589.field3592) {
						SecureUrlRequester.getLoginError(class145.field1666);
						return;
					}

					class153.updateLoginState(LoginState.READ_ACCOUNT_INFO);
				}

				if (LoginState.READ_ACCOUNT_INFO == class346.loginState && ((AbstractSocket)var1).available() >= class145.field1666) {
					boolean var42 = ((AbstractSocket)var1).readUnsignedByte() == 1;
					((AbstractSocket)var1).read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var41 = false;
					if (var42) {
						var14 = var2.readByteIsaac() << 24;
						var14 |= var2.readByteIsaac() << 16;
						var14 |= var2.readByteIsaac() << 8;
						var14 |= var2.readByteIsaac();
						TaskHandler.clientPreferences.put(Login.Login_username, var14);
					}

					if (Login_isUsernameRemembered) {
						TaskHandler.clientPreferences.updateRememberedUsername(Login.Login_username);
					} else {
						TaskHandler.clientPreferences.updateRememberedUsername((String)null);
					}

					class374.savePreferences();
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte();
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1;
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte();
					field630 = ((AbstractSocket)var1).readUnsignedByte();
					((AbstractSocket)var1).read(var2.array, 0, 8);
					var2.offset = 0;
					this.accountHash = var2.readLong();
					((AbstractSocket)var1).read(var2.array, 0, 8);
					var2.offset = 0;
					userId = var2.readLong();
					((AbstractSocket)var1).read(var2.array, 0, 8);
					var2.offset = 0;
					userHash = var2.readLong();
					class417.method8077().method4589(this.https);
					class153.updateLoginState(LoginState.SET_SERVER_PROTOCOL);
				}

				if (class346.loginState == LoginState.SET_SERVER_PROTOCOL && ((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
					((AbstractSocket)var1).read(var2.array, 0, 1);
					var2.offset = 0;
					if (var2.method10033()) {
						((AbstractSocket)var1).read(var2.array, 1, 1);
						var2.offset = 0;
					}

					ServerPacket[] var37 = LoginState.ServerPacket_values();
					var14 = var2.readSmartByteShortIsaac();
					if (var14 < 0 || var14 >= var37.length) {
						throw new IOException("Invalid ServerProt: " + var14 + " at " + var2.offset);
					}

					packetWriter.serverPacket = var37[var14];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					((AbstractSocket)var1).read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						class26.method391(Projectile.client, "zap");
					} catch (Throwable var15) {
					}

					class153.updateLoginState(LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS);
				}

				if (class346.loginState == LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS) {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method8793();
						Language.method7860();
						playerUpdateManager.updatePlayer(var2);
						GameEngine.entity = SpriteMask.localPlayer;
						class357.field3813 = -1;
						WallDecoration.loadRegions(false, var2);
						packetWriter.serverPacket = null;
						field513 = false;
					}

				} else {
					if (class346.loginState == LoginState.UNMAPPED_17 && ((AbstractSocket)var1).available() >= 2) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, 2);
						var2.offset = 0;
						class93.field1125 = var2.readUnsignedShort();
						class153.updateLoginState(LoginState.UNMAPPED_18);
					}

					if (LoginState.UNMAPPED_18 == class346.loginState && ((AbstractSocket)var1).available() >= class93.field1125) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, class93.field1125);
						var2.offset = 0;
						String var39 = var2.readStringCp1252NullTerminated();
						String var35 = var2.readStringCp1252NullTerminated();
						String var36 = var2.readStringCp1252NullTerminated();
						class132.setLoginResponseString(var39, var35, var36);
						BuddyRankComparator.updateGameState(10);
						if (field616.method10413()) {
							class6.updateLoginIndex(9);
						}
					}

					if (class346.loginState != LoginState.UNMAPPED_19) {
						++field540;
						if (field540 > 2000) {
							if (field541 < 1) {
								if (GameEngine.worldPort == HorizontalAlignment.currentPort) {
									HorizontalAlignment.currentPort = SwapSongTask.js5Port;
								} else {
									HorizontalAlignment.currentPort = GameEngine.worldPort;
								}

								++field541;
								class153.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
							} else {
								SecureUrlRequester.getLoginError(-3);
							}
						}
					} else {
						if (packetWriter.serverPacketLength == -1) {
							if (((AbstractSocket)var1).available() < 2) {
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2);
							var2.offset = 0;
							packetWriter.serverPacketLength = var2.readUnsignedShort();
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
							var2.offset = 0;
							var13 = packetWriter.serverPacketLength;
							timer.method8795();
							packetWriter.clearBuffer();
							packetWriter.packetBuffer.offset = 0;
							packetWriter.serverPacket = null;
							packetWriter.field1478 = null;
							packetWriter.field1479 = null;
							packetWriter.field1480 = null;
							packetWriter.serverPacketLength = 0;
							packetWriter.field1467 = 0;
							rebootTimer = 0;
							class4.method16();
							minimapState = 0;
							destinationX = 0;
							class198.topLevelWorldView.method2944();
							ItemContainer.itemContainers = new NodeHashTable(32);
							BuddyRankComparator.updateGameState(30);

							for (var14 = 0; var14 < 100; ++var14) {
								validRootWidgets[var14] = true;
							}

							if (packetWriter != null && packetWriter.isaacCipher != null) {
								PacketBufferNode var38 = class113.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, packetWriter.isaacCipher);
								var38.packetBuffer.writeByte(LoginPacket.getWindowedMode());
								var38.packetBuffer.writeShort(HttpRequestTask.canvasWidth);
								var38.packetBuffer.writeShort(class268.canvasHeight);
								packetWriter.addNode(var38);
							}

							playerUpdateManager.updatePlayer(var2);
							if (var13 != var2.offset) {
								throw new RuntimeException();
							}
						}
					}
				}
			}
		} catch (IOException var23) {
			if (field541 < 1) {
				if (HorizontalAlignment.currentPort == GameEngine.worldPort) {
					HorizontalAlignment.currentPort = SwapSongTask.js5Port;
				} else {
					HorizontalAlignment.currentPort = GameEngine.worldPort;
				}

				++field541;
				class153.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
			} else {
				SecureUrlRequester.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2082867900"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) {
			--rebootTimer;
		}

		if (logoutTimer > 0) {
			--logoutTimer;
		}

		if (hadNetworkError) {
			hadNetworkError = false;
			WorldMapSectionType.method6254();
		} else {
			if (!isMenuOpen) {
				WorldMapID.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1434(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				int var2;
				PacketBufferNode var15;
				while (class337.method6770()) {
					var15 = class113.getPacketBufferNode(ClientPacket.REFLECTION_CHECK_REPLY, packetWriter.isaacCipher);
					var15.packetBuffer.writeByte(0);
					var2 = var15.packetBuffer.offset;
					ClanSettings.performReflectionCheck(var15.packetBuffer);
					var15.packetBuffer.writeLengthByte(var15.packetBuffer.offset - var2);
					packetWriter.addNode(var15);
				}

				if (timer.field4921) {
					var15 = class113.getPacketBufferNode(ClientPacket.LOGIN_TIMINGS, packetWriter.isaacCipher);
					var15.packetBuffer.writeByte(0);
					var2 = var15.packetBuffer.offset;
					timer.write(var15.packetBuffer);
					var15.packetBuffer.writeLengthByte(var15.packetBuffer.offset - var2);
					packetWriter.addNode(var15);
					timer.method8794();
				}

				int var3;
				int var4;
				int var5;
				int var6;
				int var7;
				int var8;
				int var9;
				int var10;
				int var11;
				int var12;
				PacketBuffer var10000;
				synchronized(IgnoreList.mouseRecorder.lock) {
					if (!field788) {
						IgnoreList.mouseRecorder.index = 0;
					} else if (MouseHandler.MouseHandler_lastButton != 0 || IgnoreList.mouseRecorder.index >= 40) {
						PacketBufferNode var16 = null;
						var3 = 0;
						var4 = 0;
						var5 = 0;
						var6 = 0;

						for (var7 = 0; var7 < IgnoreList.mouseRecorder.index && (var16 == null || var16.packetBuffer.offset - var3 < 246); ++var7) {
							var4 = var7;
							var8 = IgnoreList.mouseRecorder.ys[var7];
							if (var8 < -1) {
								var8 = -1;
							} else if (var8 > 65534) {
								var8 = 65534;
							}

							var9 = IgnoreList.mouseRecorder.xs[var7];
							if (var9 < -1) {
								var9 = -1;
							} else if (var9 > 65534) {
								var9 = 65534;
							}

							if (var9 != field706 || var8 != field723) {
								if (var16 == null) {
									var16 = class113.getPacketBufferNode(ClientPacket.field3315, packetWriter.isaacCipher);
									var16.packetBuffer.writeByte(0);
									var3 = var16.packetBuffer.offset;
									var10000 = var16.packetBuffer;
									var10000.offset += 2;
									var5 = 0;
									var6 = 0;
								}

								if (-1L != field522) {
									var10 = var9 - field706;
									var11 = var8 - field723;
									var12 = (int)((IgnoreList.mouseRecorder.millis[var7] - field522) / 20L);
									var5 = (int)((long)var5 + (IgnoreList.mouseRecorder.millis[var7] - field522) % 20L);
								} else {
									var10 = var9;
									var11 = var8;
									var12 = Integer.MAX_VALUE;
								}

								field706 = var9;
								field723 = var8;
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
									var10 += 32;
									var11 += 32;
									var16.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
									var10 += 128;
									var11 += 128;
									var16.packetBuffer.writeByte(var12 + 128);
									var16.packetBuffer.writeShort(var11 + (var10 << 8));
								} else if (var12 < 32) {
									var16.packetBuffer.writeByte(var12 + 192);
									if (var9 != -1 && var8 != -1) {
										var16.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var16.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var16.packetBuffer.writeShort((var12 & 8191) + 57344);
									if (var9 != -1 && var8 != -1) {
										var16.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var16.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6;
								field522 = IgnoreList.mouseRecorder.millis[var7];
							}
						}

						if (var16 != null) {
							var16.packetBuffer.writeLengthByte(var16.packetBuffer.offset - var3);
							var7 = var16.packetBuffer.offset;
							var16.packetBuffer.offset = var3;
							var16.packetBuffer.writeByte(var5 / var6);
							var16.packetBuffer.writeByte(var5 % var6);
							var16.packetBuffer.offset = var7;
							packetWriter.addNode(var16);
						}

						if (var4 >= IgnoreList.mouseRecorder.index) {
							IgnoreList.mouseRecorder.index = 0;
						} else {
							MouseRecorder var62 = IgnoreList.mouseRecorder;
							var62.index -= var4;
							System.arraycopy(IgnoreList.mouseRecorder.xs, var4, IgnoreList.mouseRecorder.xs, 0, IgnoreList.mouseRecorder.index);
							System.arraycopy(IgnoreList.mouseRecorder.ys, var4, IgnoreList.mouseRecorder.ys, 0, IgnoreList.mouseRecorder.index);
							System.arraycopy(IgnoreList.mouseRecorder.millis, var4, IgnoreList.mouseRecorder.millis, 0, IgnoreList.mouseRecorder.index);
						}
					}
				}

				PacketBufferNode var19;
				if (MouseHandler.MouseHandler_lastButton == 1 || !class150.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
					long var17 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis;
					if (var17 > 32767L) {
						var17 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis;
					var3 = MouseHandler.MouseHandler_lastPressedY;
					if (var3 < 0) {
						var3 = 0;
					} else if (var3 > class268.canvasHeight) {
						var3 = class268.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX;
					if (var4 < 0) {
						var4 = 0;
					} else if (var4 > HttpRequestTask.canvasWidth) {
						var4 = HttpRequestTask.canvasWidth;
					}

					var5 = (int)var17;
					var19 = class113.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, packetWriter.isaacCipher);
					var19.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0));
					var19.packetBuffer.writeShort(var4);
					var19.packetBuffer.writeShort(var3);
					packetWriter.addNode(var19);
				}

				if (mouseWheelRotation != 0) {
					var15 = class113.getPacketBufferNode(ClientPacket.field3350, packetWriter.isaacCipher);
					var15.packetBuffer.writeShort(mouseWheelRotation);
					packetWriter.addNode(var15);
				}

				if (indexCheck.field2990 > 0) {
					var15 = class113.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD, packetWriter.isaacCipher);
					var15.packetBuffer.writeShort(0);
					var2 = var15.packetBuffer.offset;
					long var20 = class77.method2338();

					for (var5 = 0; var5 < indexCheck.field2990; ++var5) {
						long var22 = var20 - field709;
						if (var22 > 16777215L) {
							var22 = 16777215L;
						}

						field709 = var20;
						var15.packetBuffer.method10136((int)var22);
						var15.packetBuffer.writeByteAdd(indexCheck.field2986[var5]);
					}

					var15.packetBuffer.writeLengthShort(var15.packetBuffer.offset - var2);
					packetWriter.addNode(var15);
				}

				if (field605 > 0) {
					--field605;
				}

				if (indexCheck.isValidIndexInRange(96) || indexCheck.isValidIndexInRange(97) || indexCheck.isValidIndexInRange(98) || indexCheck.isValidIndexInRange(99)) {
					field606 = true;
				}

				if (field606 && field605 <= 0) {
					field605 = 20;
					field606 = false;
					var15 = class113.getPacketBufferNode(ClientPacket.EVENT_CAMERA_POSITION, packetWriter.isaacCipher);
					var15.packetBuffer.writeShort(camAngleX);
					var15.packetBuffer.writeShort(camAngleY);
					packetWriter.addNode(var15);
				}

				if (WorldMapEvent.hasFocus && !hadFocus) {
					hadFocus = true;
					var15 = class113.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
					var15.packetBuffer.writeByte(1);
					packetWriter.addNode(var15);
				}

				if (!WorldMapEvent.hasFocus && hadFocus) {
					hadFocus = false;
					var15 = class113.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
					var15.packetBuffer.writeByte(0);
					packetWriter.addNode(var15);
				}

				if (LoginState.worldMap != null) {
					LoginState.worldMap.method9528();
				}

				if (Clock.ClanChat_inClanChat) {
					if (PendingSpawn.friendsChat != null) {
						PendingSpawn.friendsChat.sort();
					}

					WidgetDefinition.method6909();
					Clock.ClanChat_inClanChat = false;
				}

				Iterator var40;
				WorldView var41;
				if (ObjectSound.field848) {
					var40 = worldViewManager.iterator();

					while (var40.hasNext()) {
						var41 = (WorldView)var40.next();

						for (var3 = 0; var3 < playerUpdateManager.playerCount; ++var3) {
							Player var24 = class198.topLevelWorldView.players[playerUpdateManager.playerIndices[var3]];
							if (var24 != null) {
								var24.method2606();
							}
						}
					}

					ObjectSound.field848 = false;
				}

				AbstractByteArrayCopier.method7493();
				if (gameState == 30) {
					var40 = worldViewManager.iterator();

					while (var40.hasNext()) {
						var41 = (WorldView)var40.next();

						for (PendingSpawn var25 = (PendingSpawn)var41.pendingSpawns.last(); var25 != null; var25 = (PendingSpawn)var41.pendingSpawns.previous()) {
							if (var25.hitpoints > 0) {
								--var25.hitpoints;
							}

							ObjectComposition var26;
							boolean var34;
							if (var25.hitpoints == 0) {
								if (var25.objectId >= 0) {
									var5 = var25.objectId;
									var6 = var25.field1204;
									var26 = UrlRequest.getObjectDefinition(var5);
									if (var6 == 11) {
										var6 = 10;
									}

									if (var6 >= 5 && var6 <= 8) {
										var6 = 4;
									}

									var34 = var26.method4222(var6);
									if (!var34) {
										continue;
									}
								}

								class165.addPendingSpawnToScene(var41, var25.plane, var25.type, var25.x, var25.y, var25.objectId, var25.field1202, var25.field1204, var25.field1214);
								var25.remove();
							} else {
								if (var25.delay > 0) {
									--var25.delay;
								}

								if (var25.delay == 0 && var25.x >= 1 && var25.y >= 1 && var25.x <= 102 && var25.y <= 102) {
									if (var25.field1200 >= 0) {
										var5 = var25.field1200;
										var6 = var25.field1207;
										var26 = UrlRequest.getObjectDefinition(var5);
										if (var6 == 11) {
											var6 = 10;
										}

										if (var6 >= 5 && var6 <= 8) {
											var6 = 4;
										}

										var34 = var26.method4222(var6);
										if (!var34) {
											continue;
										}
									}

									class165.addPendingSpawnToScene(var41, var25.plane, var25.type, var25.x, var25.y, var25.field1200, var25.field1206, var25.field1207, var25.field1214);
									var25.delay = -1;
									if (var25.field1200 == var25.objectId && var25.objectId == -1) {
										var25.remove();
									} else if (var25.objectId == var25.field1200 && var25.field1202 == var25.field1206 && var25.field1207 == var25.field1204) {
										var25.remove();
									}
								}
							}
						}
					}

					int var10002;
					for (var1 = 0; var1 < soundEffectCount; ++var1) {
						var10002 = queuedSoundEffectDelays[var1]--;
						if (queuedSoundEffectDelays[var1] >= -10) {
							SoundEffect var43 = soundEffects[var1];
							if (var43 == null) {
								var10000 = null;
								var43 = SoundEffect.readSoundEffect(ObjectComposition.soundEffectsArchive, soundEffectIds[var1], 0);
								if (var43 == null) {
									continue;
								}

								int[] var63 = queuedSoundEffectDelays;
								var63[var1] += var43.calculateDelay();
								soundEffects[var1] = var43;
							}

							if (queuedSoundEffectDelays[var1] < 0) {
								if (soundLocations[var1] != 0) {
									var4 = (soundLocations[var1] & 255) * 128;
									var5 = soundLocations[var1] >> 16 & 255;
									var6 = Math.abs(Coord.method6854(var5) - SpriteMask.localPlayer.x);
									var7 = soundLocations[var1] >> 8 & 255;
									var8 = Math.abs(Coord.method6854(var7) - SpriteMask.localPlayer.y);
									var9 = Math.max(var8 + var6 - 128, 0);
									var10 = Math.max(((field573[var1] & 31) - 1) * 128, 0);
									if (var9 >= var4) {
										queuedSoundEffectDelays[var1] = -100;
										continue;
									}

									float var39 = var10 < var4 ? Math.min(Math.max((float)(var4 - var9) / (float)(var4 - var10), 0.0F), 1.0F) : 1.0F;
									var3 = (int)(var39 * (float)TaskHandler.clientPreferences.getAreaSoundEffectsVolume());
								} else {
									var3 = TaskHandler.clientPreferences.getSoundEffectsVolume();
								}

								if (var3 > 0) {
									RawSound var48 = var43.toRawSound().resample(class333.decimator);
									RawPcmStream var27 = RawPcmStream.createRawPcmStream(var48, 100, var3);
									var27.setNumLoops(queuedSoundEffectLoops[var1] - 1);
									Widget.pcmStreamMixer.addSubStream(var27);
								}

								queuedSoundEffectDelays[var1] = -100;
							}
						} else {
							--soundEffectCount;

							for (var2 = var1; var2 < soundEffectCount; ++var2) {
								soundEffectIds[var2] = soundEffectIds[var2 + 1];
								soundEffects[var2] = soundEffects[var2 + 1];
								queuedSoundEffectLoops[var2] = queuedSoundEffectLoops[var2 + 1];
								queuedSoundEffectDelays[var2] = queuedSoundEffectDelays[var2 + 1];
								soundLocations[var2] = soundLocations[var2 + 1];
								field573[var2] = field573[var2 + 1];
							}

							--var1;
						}
					}

					if (playingJingle && !WallDecoration.method5613()) {
						if (TaskHandler.clientPreferences.getMusicVolume() != 0) {
							boolean var33 = !class333.field3628.isEmpty();
							if (var33) {
								FaceNormal.method5261(MouseHandler.archive6, TaskHandler.clientPreferences.getMusicVolume());
							}
						}

						playingJingle = false;
					}

					++packetWriter.field1467;
					if (packetWriter.field1467 > 750) {
						WorldMapSectionType.method6254();
					} else {
						UserComparator8.method3277();
						var40 = worldViewManager.iterator();

						while (var40.hasNext()) {
							var41 = (WorldView)var40.next();

							for (var3 = 0; var3 < var41.npcCount; ++var3) {
								var4 = var41.npcIndices[var3];
								NPC var57 = var41.npcs[var4];
								if (var57 != null) {
									Skeleton.updateActorSequence(var41, var57, var57.definition.size);
								}
							}
						}

						WorldMapLabelSize.method5879();
						class135.method3435();
						++graphicsCycle;
						if (mouseCrossColor != 0) {
							mouseCrossState = mouseCrossState * 400 + 20;
							if (mouseCrossState * 400 >= 400) {
								mouseCrossColor = 0;
							}
						}

						Widget var42 = PcmPlayer.mousedOverWidgetIf1;
						Widget var45 = WorldMapArchiveLoader.field5242;
						PcmPlayer.mousedOverWidgetIf1 = null;
						WorldMapArchiveLoader.field5242 = null;
						draggedOnWidget = null;
						field691 = false;
						field558 = false;
						field735 = 0;

						while (indexCheck.method5650() && field735 < 128) {
							if (staffModLevel >= 2 && indexCheck.isValidIndexInRange(82) && indexCheck.field2988 == 66) {
								StringBuilder var49 = new StringBuilder();

								Message var44;
								for (Iterator var58 = Messages.Messages_hashTable.iterator(); var58.hasNext(); var49.append(var44.text).append('\n')) {
									var44 = (Message)var58.next();
									if (var44.sender != null && !var44.sender.isEmpty()) {
										var49.append(var44.sender).append(':');
									}
								}

								String var51 = var49.toString();
								Projectile.client.method497(var51);
							} else if (oculusOrbState != 1 || indexCheck.field2996 <= 0) {
								field737[field735] = indexCheck.field2988;
								field736[field735] = indexCheck.field2996;
								++field735;
							}
						}

						if (class135.method3431() && indexCheck.isValidIndexInRange(82) && indexCheck.isValidIndexInRange(81) && mouseWheelRotation != 0) {
							var3 = SpriteMask.localPlayer.plane - mouseWheelRotation;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > 3) {
								var3 = 3;
							}

							if (var3 != SpriteMask.localPlayer.plane) {
								var4 = SpriteMask.localPlayer.pathX[0] + class198.topLevelWorldView.baseX;
								var5 = SpriteMask.localPlayer.pathY[0] + class198.topLevelWorldView.baseY;
								var19 = class113.getPacketBufferNode(ClientPacket.field3402, packetWriter.isaacCipher);
								var19.packetBuffer.writeByteNeg(var3);
								var19.packetBuffer.writeIntME(0);
								var19.packetBuffer.writeShortLE(var5);
								var19.packetBuffer.writeShortLE(var4);
								packetWriter.addNode(var19);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							class167.updateRootInterface(rootInterface, 0, 0, HttpRequestTask.canvasWidth, class268.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var50;
							ScriptEvent var52;
							Widget var59;
							do {
								var52 = (ScriptEvent)scriptEvents2.removeLast();
								if (var52 == null) {
									while (true) {
										do {
											var52 = (ScriptEvent)scriptEvents3.removeLast();
											if (var52 == null) {
												while (true) {
													do {
														var52 = (ScriptEvent)scriptEvents.removeLast();
														if (var52 == null) {
															boolean var35 = false;

															while (true) {
																class268 var53 = (class268)field711.removeLast();
																PacketBufferNode var28;
																if (var53 == null) {
																	if (!var35 && MouseHandler.MouseHandler_lastButton == 1) {
																		field754.method5617();
																	}

																	this.menu();
																	FaceNormal.method5262();
																	if (clickedWidget != null) {
																		this.method1332();
																	}

																	Iterator var54 = worldViewManager.iterator();

																	while (var54.hasNext()) {
																		WorldView var61 = (WorldView)var54.next();
																		Scene var46 = var61.scene;
																		if (var46.shouldSendWalk()) {
																			var7 = var46.baseX;
																			var8 = var46.baseY;
																			PacketBufferNode var29 = class113.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, packetWriter.isaacCipher);
																			var29.packetBuffer.writeByte(5);
																			var29.packetBuffer.writeByteAdd(indexCheck.isValidIndexInRange(82) ? (indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
																			var29.packetBuffer.writeShortAdd(var7 + var61.baseX);
																			var29.packetBuffer.writeShortAddLE(var8 + var61.baseY);
																			packetWriter.addNode(var29);
																			mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																			mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																			mouseCrossColor = 1;
																			mouseCrossState = 0;
																			destinationX = var7;
																			destinationY = var8;
																			var46.method5174();
																		}
																	}

																	if (var42 != PcmPlayer.mousedOverWidgetIf1) {
																		if (var42 != null) {
																			class110.invalidateWidget(var42);
																		}

																		if (PcmPlayer.mousedOverWidgetIf1 != null) {
																			class110.invalidateWidget(PcmPlayer.mousedOverWidgetIf1);
																		}
																	}

																	if (var45 != WorldMapArchiveLoader.field5242 && field657 == field544) {
																		if (var45 != null) {
																			class110.invalidateWidget(var45);
																		}

																		if (WorldMapArchiveLoader.field5242 != null) {
																			class110.invalidateWidget(WorldMapArchiveLoader.field5242);
																		}
																	}

																	if (WorldMapArchiveLoader.field5242 != null) {
																		if (field544 < field657) {
																			++field544;
																			if (field657 == field544) {
																				class110.invalidateWidget(WorldMapArchiveLoader.field5242);
																			}
																		}
																	} else if (field544 > 0) {
																		--field544;
																	}

																	if (oculusOrbState == 0) {
																		var4 = GameEngine.entity.getX();
																		var5 = GameEngine.entity.getY();
																		if (field520 != -1) {
																			Player var47 = SpriteMask.localPlayer.worldView.players[field520];
																			if (var47 != null) {
																				Coord var56 = var47.method2727(SpriteMask.localPlayer.worldView);
																				var4 = var56.x;
																				var5 = var56.y;
																			}
																		}

																		var6 = GameEngine.entity.getPlane();
																		if (ArchiveDisk.oculusOrbFocalPointX - var4 < -500 || ArchiveDisk.oculusOrbFocalPointX - var4 > 500 || class298.oculusOrbFocalPointY - var5 < -500 || class298.oculusOrbFocalPointY - var5 > 500) {
																			ArchiveDisk.oculusOrbFocalPointX = var4;
																			class298.oculusOrbFocalPointY = var5;
																		}

																		if (var4 != ArchiveDisk.oculusOrbFocalPointX) {
																			ArchiveDisk.oculusOrbFocalPointX += (var4 - ArchiveDisk.oculusOrbFocalPointX) / 16;
																		}

																		if (var5 != class298.oculusOrbFocalPointY) {
																			class298.oculusOrbFocalPointY += (var5 - class298.oculusOrbFocalPointY) / 16;
																		}

																		var7 = ArchiveDisk.oculusOrbFocalPointX >> 7;
																		var8 = class298.oculusOrbFocalPointY >> 7;
																		var9 = ScriptFrame.getTileHeight(class198.topLevelWorldView, ArchiveDisk.oculusOrbFocalPointX, class298.oculusOrbFocalPointY, var6);
																		var10 = 0;
																		if (var7 > 3 && var8 > 3 && var7 < 100 && var8 < 100) {
																			for (var11 = var7 - 4; var11 <= var7 + 4; ++var11) {
																				for (var12 = var8 - 4; var12 <= var8 + 4; ++var12) {
																					int var30 = var6;
																					if (var6 < 3 && (class198.topLevelWorldView.tileSettings[1][var11][var12] & 2) == 2) {
																						var30 = var6 + 1;
																					}

																					int var14 = var9 - class198.topLevelWorldView.tileHeights[var30][var11][var12];
																					if (var14 > var10) {
																						var10 = var14;
																					}
																				}
																			}
																		}

																		var11 = var10 * 192;
																		if (var11 > 98048) {
																			var11 = 98048;
																		}

																		if (var11 < 32768) {
																			var11 = 32768;
																		}

																		if (var11 > field607) {
																			field607 += (var11 - field607) / 24;
																		} else if (var11 < field607) {
																			field607 += (var11 - field607) / 80;
																		}

																		Projectile.oculusOrbFocalPointZ = ScriptFrame.getTileHeight(class198.topLevelWorldView, var4, var5, var6) - camFollowHeight;
																	} else if (oculusOrbState == 1) {
																		Message.method1254();
																		short var37 = -1;
																		if (indexCheck.isValidIndexInRange(33)) {
																			var37 = 0;
																		} else if (indexCheck.isValidIndexInRange(49)) {
																			var37 = 1024;
																		}

																		if (indexCheck.isValidIndexInRange(48)) {
																			if (var37 == 0) {
																				var37 = 1792;
																			} else if (var37 == 1024) {
																				var37 = 1280;
																			} else {
																				var37 = 1536;
																			}
																		} else if (indexCheck.isValidIndexInRange(50)) {
																			if (var37 == 0) {
																				var37 = 256;
																			} else if (var37 == 1024) {
																				var37 = 768;
																			} else {
																				var37 = 512;
																			}
																		}

																		byte var38 = 0;
																		if (indexCheck.isValidIndexInRange(35)) {
																			var38 = -1;
																		} else if (indexCheck.isValidIndexInRange(51)) {
																			var38 = 1;
																		}

																		var6 = 0;
																		if (var37 >= 0 || var38 != 0) {
																			var6 = indexCheck.isValidIndexInRange(81) ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed;
																			var6 *= 16;
																			field546 = var37;
																			field600 = var38;
																		}

																		if (field598 < var6) {
																			field598 += var6 / 8;
																			if (field598 > var6) {
																				field598 = var6;
																			}
																		} else if (field598 > var6) {
																			field598 = field598 * 9 / 10;
																		}

																		if (field598 > 0) {
																			var7 = field598 / 16;
																			if (field546 >= 0) {
																				var4 = field546 - class390.cameraYaw & 2047;
																				var8 = Rasterizer3D.Rasterizer3D_sine[var4];
																				var9 = Rasterizer3D.Rasterizer3D_cosine[var4];
																				ArchiveDisk.oculusOrbFocalPointX += var7 * var8 / 65536;
																				class298.oculusOrbFocalPointY += var9 * var7 / 65536;
																			}

																			if (field600 != 0) {
																				Projectile.oculusOrbFocalPointZ += var7 * field600;
																				if (Projectile.oculusOrbFocalPointZ > 0) {
																					Projectile.oculusOrbFocalPointZ = 0;
																				}
																			}
																		} else {
																			field546 = -1;
																			field600 = -1;
																		}

																		if (indexCheck.isValidIndexInRange(13)) {
																			ArchiveLoader.method2534();
																		}
																	}

																	if (MouseHandler.MouseHandler_currentButton == 4 && class150.mouseCam) {
																		var4 = MouseHandler.MouseHandler_y - mouseCamClickedY;
																		camAngleDX = var4 * 2;
																		mouseCamClickedY = var4 != -1 && var4 != 1 ? (MouseHandler.MouseHandler_y + mouseCamClickedY) / 2 : MouseHandler.MouseHandler_y;
																		var5 = mouseCamClickedX - MouseHandler.MouseHandler_x;
																		camAngleDY = var5 * 2;
																		mouseCamClickedX = var5 != -1 && var5 != 1 ? (MouseHandler.MouseHandler_x + mouseCamClickedX) / 2 : MouseHandler.MouseHandler_x;
																	} else {
																		if (indexCheck.isValidIndexInRange(96)) {
																			camAngleDY += (-24 - camAngleDY) / 2;
																		} else if (indexCheck.isValidIndexInRange(97)) {
																			camAngleDY += (24 - camAngleDY) / 2;
																		} else {
																			camAngleDY /= 2;
																		}

																		if (indexCheck.isValidIndexInRange(98)) {
																			camAngleDX += (12 - camAngleDX) / 2;
																		} else if (indexCheck.isValidIndexInRange(99)) {
																			camAngleDX += (-12 - camAngleDX) / 2;
																		} else {
																			camAngleDX /= 2;
																		}

																		mouseCamClickedY = MouseHandler.MouseHandler_y;
																		mouseCamClickedX = MouseHandler.MouseHandler_x;
																	}

																	camAngleY = camAngleDY / 2 + camAngleY & 2047;
																	camAngleX += camAngleDX / 2;
																	if (camAngleX < 128) {
																		camAngleX = 128;
																	}

																	if (camAngleX > 383) {
																		camAngleX = 383;
																	}

																	if (field748) {
																		PcmPlayer.method835();
																	} else if (isCameraLocked) {
																		AbstractByteArrayCopier.method7492();
																	}

																	for (var4 = 0; var4 < 5; ++var4) {
																		var10002 = field682[var4]++;
																	}

																	class508.varcs.tryWrite();
																	var4 = ++MouseHandler.MouseHandler_idleCycles - 1;
																	var6 = GameEngine.keyHandler.method355();
																	if (var4 > 15000 && var6 > 15000) {
																		logoutTimer = 250;
																		MouseHandler.MouseHandler_idleCycles = 14500;
																		var28 = class113.getPacketBufferNode(ClientPacket.EVENT_MOUSE_IDLE, packetWriter.isaacCipher);
																		packetWriter.addNode(var28);
																	}

																	ItemContainer.friendSystem.processFriendUpdates();
																	AsyncRestClient.method169();
																	++packetWriter.pendingWrites;
																	if (packetWriter.pendingWrites > 50) {
																		var28 = class113.getPacketBufferNode(ClientPacket.NO_TIMEOUT, packetWriter.isaacCipher);
																		packetWriter.addNode(var28);
																	}

																	try {
																		packetWriter.flush();
																	} catch (IOException var31) {
																		WorldMapSectionType.method6254();
																	}

																	class417.method8077().method4567();
																	return;
																}

																if (var53.field2980.type == 12) {
																	var35 = true;
																}

																if (var53 != null && var53.field2980 != null) {
																	if (var53.field2980.childIndex >= 0) {
																		var59 = class416.widgetDefinition.method6911(var53.field2980.parentId);
																		if (var59 == null || var59.children == null || var59.children.length == 0 || var53.field2980.childIndex >= var59.children.length || var53.field2980 != var59.children[var53.field2980.childIndex]) {
																			continue;
																		}
																	}

																	if (var53.field2980.type == 11 && var53.field2979 == 0) {
																		if (var53.field2980.method7362(var53.field2977, var53.field2978, 0, 0)) {
																			var53.field2980.method7320().method4471().method4561(1, var53.field2980.method7320().method4424());
																			switch(var53.field2980.method7316()) {
																			case 0:
																				GrandExchangeOfferAgeComparator.openURL(var53.field2980.method7318(), true, false);
																				break;
																			case 1:
																				var6 = class171.getWidgetFlags(var53.field2980);
																				boolean var36 = (var6 >> 22 & 1) != 0;
																				if (var36) {
																					int[] var55 = var53.field2980.method7445();
																					if (var55 != null) {
																						var28 = class113.getPacketBufferNode(ClientPacket.field3407, packetWriter.isaacCipher);
																						var28.packetBuffer.writeIntLE(var53.field2980.method7317());
																						var28.packetBuffer.writeInt(var55[0]);
																						var28.packetBuffer.writeShort(var53.field2980.childIndex);
																						var28.packetBuffer.writeIntME(var53.field2980.id);
																						var28.packetBuffer.writeIntME(var55[1]);
																						var28.packetBuffer.writeIntLE(var55[2]);
																						packetWriter.addNode(var28);
																					}
																				}
																			}
																		}
																	} else if (var53.field2980.type == 12) {
																		class359 var60 = var53.field2980.method7304();
																		if (var60 != null && var60.method7061()) {
																			switch(var53.field2979) {
																			case 0:
																				field754.method5615(var53.field2980);
																				var60.method7215(true);
																				var60.method7084(var53.field2977, var53.field2978, indexCheck.isValidIndexInRange(82), indexCheck.isValidIndexInRange(81));
																				break;
																			case 1:
																				var60.method7050(var53.field2977, var53.field2978);
																			}
																		}
																	}
																}
															}
														}

														var50 = var52.widget;
														if (var50.childIndex < 0) {
															break;
														}

														var59 = class416.widgetDefinition.method6911(var50.parentId);
													} while(var59 == null || var59.children == null || var50.childIndex >= var59.children.length || var50 != var59.children[var50.childIndex]);

													Ignored.runScriptEvent(var52);
												}
											}

											var50 = var52.widget;
											if (var50.childIndex < 0) {
												break;
											}

											var59 = class416.widgetDefinition.method6911(var50.parentId);
										} while(var59 == null || var59.children == null || var50.childIndex >= var59.children.length || var50 != var59.children[var50.childIndex]);

										Ignored.runScriptEvent(var52);
									}
								}

								var50 = var52.widget;
								if (var50.childIndex < 0) {
									break;
								}

								var59 = class416.widgetDefinition.method6911(var50.parentId);
							} while(var59 == null || var59.children == null || var50.childIndex >= var59.children.length || var50 != var59.children[var50.childIndex]);

							Ignored.runScriptEvent(var52);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1559808935"
	)
	public void vmethod6782(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) {
			if (var1 > -1 && TaskHandler.clientPreferences.getMusicVolume() > 0 && !playingJingle) {
				PacketBufferNode var3 = class113.getPacketBufferNode(ClientPacket.field3385, packetWriter.isaacCipher);
				var3.packetBuffer.writeInt(var1);
				packetWriter.addNode(var3);
			}

		}
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = HttpRequestTask.canvasWidth;
		int var2 = class268.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (TaskHandler.clientPreferences != null) {
			try {
				class26.method385(Projectile.client, "resize", new Object[]{LoginPacket.getWindowedMode()});
			} catch (Throwable var4) {
			}
		}

	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-342241112"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) {
			class53.method1114(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (validRootWidgets[var1]) {
				field716[var1] = true;
			}

			field717[var1] = validRootWidgets[var1];
			validRootWidgets[var1] = false;
		}

		field590 = cycle;
		viewportX = -1;
		viewportY = -1;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			ApproximateRouteStrategy.drawWidgets(rootInterface, 0, 0, HttpRequestTask.canvasWidth, class268.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				class278.crossSprites[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				class278.crossSprites[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		if (!isMenuOpen) {
			if (viewportX != -1) {
				UserComparator10.method3329(viewportX, viewportY);
			}
		} else {
			menu.method10775();
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field717[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field716[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		WorldMapData_0.method5862(class198.topLevelWorldView.plane, SpriteMask.localPlayer.x, SpriteMask.localPlayer.y, graphicsCycle);
		graphicsCycle = 0;
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(Led;IB)Z",
		garbageValue = "62"
	)
	boolean method1492(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) {
			PendingSpawn.friendsChat = null;
		} else {
			if (PendingSpawn.friendsChat == null) {
				PendingSpawn.friendsChat = new FriendsChat(WorldMapScaleHandler.loginType, Projectile.client);
			}

			PendingSpawn.friendsChat.method8960(var1.packetBuffer, var2);
		}

		UserList.method9103();
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(Led;I)Z",
		garbageValue = "1422000135"
	)
	boolean method1457(PacketWriter var1) {
		if (PendingSpawn.friendsChat != null) {
			PendingSpawn.friendsChat.method8961(var1.packetBuffer);
		}

		UserList.method9103();
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(Led;I)Z",
		garbageValue = "-114988147"
	)
	@Export("method1434")
	final boolean method1434(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			int var6;
			String var22;
			try {
				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1475) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1467 = 0;
						var1.field1475 = false;
					}

					var3.offset = 0;
					if (var3.method10033()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1467 = 0;
					}

					var1.field1475 = true;
					ServerPacket[] var4 = LoginState.ServerPacket_values();
					var5 = var3.readSmartByteShortIsaac();
					if (var5 < 0 || var5 >= var4.length) {
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5];
					var1.serverPacketLength = var1.serverPacket.length;
				}

				if (var1.serverPacketLength == -1) {
					if (!var2.isAvailable(1)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1);
					var1.serverPacketLength = var3.array[0] & 255;
				}

				if (var1.serverPacketLength == -2) {
					if (!var2.isAvailable(2)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2);
					var3.offset = 0;
					var1.serverPacketLength = var3.readUnsignedShort();
				}

				if (!var2.isAvailable(var1.serverPacketLength)) {
					return false;
				}

				var3.offset = 0;
				var2.read(var3.array, 0, var1.serverPacketLength);
				var1.field1467 = 0;
				timer.method8809();
				var1.field1480 = var1.field1479;
				var1.field1479 = var1.field1478;
				var1.field1478 = var1.serverPacket;
				int var21;
				Widget var75;
				if (ServerPacket.UPDATE_INV_CLEAR == var1.serverPacket) {
					var21 = var3.readInt();
					var75 = class416.widgetDefinition.method6911(var21);

					for (var6 = 0; var6 < var75.itemIds.length; ++var6) {
						var75.itemIds[var6] = -1;
						var75.itemIds[var6] = 0;
					}

					class110.invalidateWidget(var75);
					var1.serverPacket = null;
					return true;
				}

				int var7;
				int var8;
				int var9;
				int var10;
				int var11;
				int var64;
				int var66;
				if (ServerPacket.DYNAMICOBJECT_SPAWN == var1.serverPacket) {
					var6 = var3.method10138();
					var21 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var21 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var66 = var3.readUnsignedShortAdd();
					var9 = var3.readUnsignedByteAdd();
					var10 = var9 >> 2;
					var11 = var9 & 3;
					var64 = field580[var10];
					if (0 <= var7 && var7 < 103 && 0 <= var8 && var8 < 103) {
						WorldMapDecoration.method6286(var7, var8, var10, var11, var64, var66);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_SPOTANIM == var1.serverPacket) {
					var6 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedShortAddLE();
					var7 = var3.readUnsignedByte();
					var21 = var3.readUnsignedShortLE();
					Player var80;
					if (var21 == localPlayerIndex) {
						var80 = SpriteMask.localPlayer;
					} else {
						var80 = class344.worldView.players[var21];
					}

					if (var80 != null) {
						var80.updateSpotAnimation(var7, var5, var6 >> 16, var6 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_LARGE_VIEWPORT_2 == var1.serverPacket) {
					class420.updateNpcs(class344.worldView, false, var3, 4);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3539 == var1.serverPacket) {
					class420.updateNpcs(class344.worldView, false, var3, 5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3463 == var1.serverPacket) {
					return this.method1492(var1, 2);
				}

				if (ServerPacket.field3546 == var1.serverPacket) {
					var21 = var3.readUnsignedShortAddLE();
					if (var21 == 65535) {
						var21 = -1;
					}

					rootInterface = var21;
					this.method1334(false);
					class187.method3964(var21);
					LoginState.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						validRootWidgets[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_REGION == var1.serverPacket) {
					WallDecoration.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3563 == var1.serverPacket) {
					class149.field1696 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_CLOSESUB == var1.serverPacket) {
					var21 = var3.readInt();
					InterfaceParent var82 = (InterfaceParent)interfaceParents.get((long)var21);
					if (var82 != null) {
						class421.closeInterface(var82, true);
					}

					if (meslayerContinueWidget != null) {
						class110.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MINIMAP_TOGGLE == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_IGNORELIST == var1.serverPacket) {
					ItemContainer.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					class369.FriendSystem_invalidateIgnoreds();
					field586 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3473 == var1.serverPacket) {
					UserComparator9.method3315(class323.field3424);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PRIVCHATMODE == var1.serverPacket) {
					class374.privateChatMode = class550.method10014(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MINIMAP_FLAG_SET == var1.serverPacket) {
					destinationX = var3.readUnsignedByte();
					if (destinationX == 255) {
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte();
					if (destinationY == 255) {
						destinationY = 0;
					}

					var1.serverPacket = null;
					return true;
				}

				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				Projectile var19;
				byte var61;
				byte var63;
				if (ServerPacket.field3488 == var1.serverPacket) {
					var14 = var3.readUnsignedByteNeg() * 4;
					var61 = var3.readByteAdd();
					var11 = var3.method10108();
					var6 = var3.readMedium();
					var21 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var21 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var16 = var3.readUnsignedShortAdd();
					var17 = var3.readUnsignedByteAdd();
					var63 = var3.readByte();
					var64 = var3.readUnsignedShort();
					var66 = var3.readUnsignedByteSub() * 4;
					var15 = var3.readUnsignedShortAdd();
					var18 = var3.readUnsignedByte();
					var9 = var61 + var7;
					var10 = var63 + var8;
					if (var7 >= 0 && var8 >= 0 && var7 < class344.worldView.sizeX && var8 < class344.worldView.sizeY && var9 >= 0 && var10 >= 0 && var9 < class344.worldView.sizeX && var10 < class344.worldView.sizeY && var64 != 65535) {
						var7 = Coord.method6854(var7);
						var8 = Coord.method6854(var8);
						var9 = Coord.method6854(var9);
						var10 = Coord.method6854(var10);
						var19 = new Projectile(var64, class344.worldView.plane, var7, var8, ScriptFrame.getTileHeight(class344.worldView, var7, var8, class344.worldView.plane) - var66, var15 + cycle, var16 + cycle, var17, var18, var11, var14);
						var19.setDestination(var9, var10, ScriptFrame.getTileHeight(class344.worldView, var9, var10, class344.worldView.plane) - var14, var15 + cycle);
						class344.worldView.projectiles.addFirst(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_STAT == var1.serverPacket) {
					PacketWriter.method3202();
					var21 = var3.readUnsignedByte();
					var5 = var3.readUnsignedIntIME();
					var6 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByteNeg();
					experience[var21] = var5;
					currentLevels[var21] = var7;
					levels[var21] = 1;
					field647[var21] = var6;

					for (var8 = 0; var8 < 98; ++var8) {
						if (var5 >= Skills.Skills_experienceTable[var8]) {
							levels[var21] = var8 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var21;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SETANGLE == var1.serverPacket) {
					isCameraLocked = true;
					field748 = false;
					field738 = false;
					GrandExchangeOfferOwnWorldComparator.field468 = var3.readUnsignedByte();
					class390.field4583 = var3.readUnsignedByte();
					HorizontalAlignment.field1997 = var3.readUnsignedShort();
					class150.field1701 = var3.readUnsignedByte();
					class364.field4043 = var3.readUnsignedByte();
					if (class364.field4043 >= 100) {
						var21 = Coord.method6854(GrandExchangeOfferOwnWorldComparator.field468);
						var5 = Coord.method6854(class390.field4583);
						var6 = ScriptFrame.getTileHeight(class198.topLevelWorldView, var21, var5, class198.topLevelWorldView.plane) - HorizontalAlignment.field1997;
						var7 = var21 - AsyncHttpResponse.cameraX;
						var8 = var6 - FloorOverlayDefinition.cameraY;
						var9 = var5 - PlayerType.cameraZ;
						var10 = (int)Math.sqrt((double)(var9 * var9 + var7 * var7));
						class323.cameraPitch = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531D) & 2047;
						class390.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047;
						if (class323.cameraPitch < 128) {
							class323.cameraPitch = 128;
						}

						if (class323.cameraPitch > 383) {
							class323.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3464 == var1.serverPacket) {
					var21 = var3.readInt();
					if (var21 != revision) {
						revision = var21;
						class155.method3614();
					}

					var1.serverPacket = null;
					return true;
				}

				long var24;
				long var26;
				long var28;
				String var31;
				boolean var62;
				byte var69;
				if (ServerPacket.field3527 == var1.serverPacket) {
					var69 = var3.readByte();
					var24 = (long)var3.readUnsignedShort();
					var26 = (long)var3.readMedium();
					var28 = var26 + (var24 << 32);
					var62 = false;
					ClanChannel var84 = var69 >= 0 ? currentClanChannels[var69] : class158.guestClanChannel;
					if (var84 == null) {
						var62 = true;
					} else {
						for (var66 = 0; var66 < 100; ++var66) {
							if (var28 == crossWorldMessageIds[var66]) {
								var62 = true;
								break;
							}
						}
					}

					if (!var62) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var28;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var31 = class416.method8056(var3);
						var14 = var69 >= 0 ? 43 : 46;
						class418.addChatMessage(var14, "", var31, var84.name);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_UID192 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						class110.method3072(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3564 == var1.serverPacket) {
					var21 = var3.readShort();
					worldViewManager.method2701(var21);
					var1.serverPacket = null;
					return true;
				}

				NPC var77;
				if (ServerPacket.field3547 == var1.serverPacket) {
					var21 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedByteNeg();
					short var68 = (short)var3.readShortLE();
					var77 = class344.worldView.npcs[var5];
					if (var77 != null) {
						var77.method3007(var6, var21, var68);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3450 == var1.serverPacket) {
					PacketWriter.method3202();
					weight = var3.readShort();
					field705 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3530 == var1.serverPacket) {
					var7 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedShortAdd();
					var21 = var3.readUnsignedShortAddLE();
					var6 = var3.readUnsignedShort();
					WorldMapLabel.method6291(var21, var5, var6, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.TRIGGER_ONDIALOG_ABORT == var1.serverPacket) {
					if (rootInterface != -1) {
						AbstractUserComparator.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_LOOKAT == var1.serverPacket) {
					isCameraLocked = true;
					field748 = false;
					field738 = true;
					var21 = class156.method3622(var3.readShort() & 2027);
					var5 = GameEngine.method644(var3.readShort() & 2027);
					var6 = var3.readUnsignedShort();
					var7 = var3.readUnsignedByte();
					field763 = new class520(class323.cameraPitch, var5, var6, var7);
					field504 = new class520(class390.cameraYaw, var21, var6, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3578 == var1.serverPacket) {
					AbstractWorldMapIcon.updateWorldEntitiesFromPacketBuffer(class344.worldView, var3, 2);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3558 == var1.serverPacket) {
					UserComparator9.method3315(class323.field3416);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CHAT_FILTER_SETTINGS == var1.serverPacket) {
					tradeChatMode = var3.readUnsignedByteAdd();
					publicChatMode = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3498 == var1.serverPacket) {
					for (var21 = 0; var21 < class344.worldView.players.length; ++var21) {
						if (class344.worldView.players[var21] != null) {
							class344.worldView.players[var21].sequence = -1;
						}
					}

					for (var21 = 0; var21 < class344.worldView.npcs.length; ++var21) {
						if (class344.worldView.npcs[var21] != null) {
							class344.worldView.npcs[var21].sequence = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var57;
				Widget var85;
				if (ServerPacket.field3480 == var1.serverPacket) {
					var21 = var3.readUnsignedIntIME();
					var57 = var3.readUnsignedByte() == 1;
					var85 = class416.widgetDefinition.method6911(var21);
					var85.method7330(SpriteMask.localPlayer.appearance, var57);
					class110.invalidateWidget(var85);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_SMALL == var1.serverPacket) {
					var69 = var3.readByteSub();
					var5 = var3.readUnsignedShortLE();
					Varps.Varps_temp[var5] = var69;
					if (Varps.Varps_main[var5] != var69) {
						Varps.Varps_main[var5] = var69;
					}

					class356.changeGameOptions(var5);
					changedVarps[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PROJECTILE_SPAWN_OLD == var1.serverPacket) {
					var6 = var3.method10137();
					var21 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var21 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var14 = var3.readUnsignedByteSub() * 4;
					var18 = var3.readUnsignedShortAdd();
					var63 = var3.readByteSub();
					var17 = var3.readUnsignedByteNeg();
					var16 = var3.readUnsignedShort();
					var61 = var3.readByte();
					var11 = var3.method10140();
					var66 = var3.readUnsignedByte() * 4;
					var64 = var3.readUnsignedShort();
					var15 = var3.readUnsignedShortAddLE();
					var9 = var61 + var7;
					var10 = var63 + var8;
					if (0 <= var7 && var7 < 104 && 0 <= var8 && var8 < 104 && 0 <= var9 && var9 < 104 && 0 <= var10 && var10 < 104 && var64 != 65535) {
						var7 = Coord.method6854(var7);
						var8 = Coord.method6854(var8);
						var9 = Coord.method6854(var9);
						var10 = Coord.method6854(var10);
						var19 = new Projectile(var64, class344.worldView.plane, var7, var8, ScriptFrame.getTileHeight(class344.worldView, var7, var8, class344.worldView.plane) - var66, var15 + cycle, var16 + cycle, var17, var18, var11, var14);
						var19.setDestination(var9, var10, ScriptFrame.getTileHeight(class344.worldView, var9, var10, class344.worldView.plane) - var14, var15 + cycle);
						class344.worldView.projectiles.addFirst(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3436 == var1.serverPacket) {
					var8 = var3.readUnsignedShortAddLE();
					var6 = var3.readUnsignedShortLE();
					var21 = var3.readUnsignedShort();
					if (var21 == 65535) {
						var21 = -1;
					}

					var5 = var3.readUnsignedShortLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					var7 = var3.readUnsignedShortAdd();
					var9 = var3.readUnsignedShortAdd();
					ArrayList var91 = new ArrayList();
					var91.add(var21);
					var91.add(var5);
					WorldMapData_1.method6173(var91, var6, var7, var8, var9);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3509 == var1.serverPacket) {
					var21 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					class1.queueSoundEffect(var21, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3567 == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedByte();
					class182.field1903 = var6;
					if (var21 == 0) {
						class198.topLevelWorldView.plane = var6;
						class344.worldView = class198.topLevelWorldView;
					} else {
						if (var21 != 1) {
							throw new RuntimeException("Don't know what world we're about to receive updates for, this is bad");
						}

						WorldEntity var97 = class198.topLevelWorldView.worldEntities[var5];
						var97.worldView.plane = var6;
						class344.worldView = var97.worldView;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3485 == var1.serverPacket) {
					PacketWriter.method3202();
					var21 = var3.readUnsignedByte();
					var5 = var3.readUnsignedIntME();
					var6 = var3.readUnsignedByteSub();
					experience[var6] = var5;
					currentLevels[var6] = var21;
					levels[var6] = 1;
					field647[var6] = var21;

					for (var7 = 0; var7 < 98; ++var7) {
						if (var5 >= Skills.Skills_experienceTable[var7]) {
							levels[var6] = var7 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var6;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED == var1.serverPacket) {
					class134.field1572 = var3.readUnsignedByteNeg();
					field734 = var3.readUnsignedByteSub();
					ItemLayer.field2480 = var3.readUnsignedByteAdd();

					while (var3.offset < var1.serverPacketLength) {
						var21 = var3.readUnsignedByte();
						class323 var81 = BuddyRankComparator.method3337()[var21];
						UserComparator9.method3315(var81);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3510 == var1.serverPacket) {
					UserComparator9.method3315(class323.field3425);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_STOCKMARKET_SLOT == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var21] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var21] = new GrandExchangeOffer(var3, false);
					}

					field703 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3505 == var1.serverPacket) {
					class544.field5379 = null;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_SPOTANIM == var1.serverPacket) {
					var6 = var3.readUnsignedShortAdd();
					var7 = var3.readUnsignedByteSub();
					var5 = var3.readInt();
					var21 = var3.readUnsignedShortLE();
					var77 = class344.worldView.npcs[var21];
					if (var77 != null) {
						var77.updateSpotAnimation(var7, var6, var5 >> 16, var5 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_RESET == var1.serverPacket) {
					field748 = false;
					isCameraLocked = false;
					field648 = false;
					field738 = false;
					GrandExchangeOfferOwnWorldComparator.field468 = 0;
					class390.field4583 = 0;
					HorizontalAlignment.field1997 = 0;
					field760 = false;
					class150.field1701 = 0;
					class364.field4043 = 0;
					HttpResponse.field82 = 0;
					Message.field461 = 0;
					ClanChannel.field1843 = 0;
					UserComparator6.field1525 = 0;
					class319.field3307 = 0;
					field761 = null;
					field763 = null;
					field504 = null;

					for (var21 = 0; var21 < 5; ++var21) {
						field765[var21] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var88;
				if (ServerPacket.IF_SETPOSITION == var1.serverPacket) {
					var21 = var3.readShortLE();
					var5 = var3.readUnsignedIntLE();
					var6 = var3.readShortLE();
					var88 = class416.widgetDefinition.method6911(var5);
					if (var6 != var88.rawX || var21 != var88.rawY || var88.xAlignment != 0 || var88.yAlignment != 0) {
						var88.rawX = var6;
						var88.rawY = var21;
						var88.xAlignment = 0;
						var88.yAlignment = 0;
						class110.invalidateWidget(var88);
						this.alignWidget(var88);
						if (var88.type == 0) {
							SoundCache.revalidateWidgetScroll(class416.widgetDefinition.Widget_interfaceComponents[var5 >> 16], var88, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3569 == var1.serverPacket) {
					AbstractWorldMapData.field3216 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_FULL == var1.serverPacket) {
					var21 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var21 < -70000) {
						var5 += 32768;
					}

					if (var21 >= 0) {
						var85 = class416.widgetDefinition.method6911(var21);
					} else {
						var85 = null;
					}

					if (var85 != null) {
						for (var7 = 0; var7 < var85.itemIds.length; ++var7) {
							var85.itemIds[var7] = 0;
							var85.itemQuantities[var7] = 0;
						}
					}

					class138.clearItemContainer(var5);
					var7 = var3.readUnsignedShort();

					for (var8 = 0; var8 < var7; ++var8) {
						var9 = var3.readUnsignedShortLE();
						var10 = var3.readUnsignedByteNeg();
						if (var10 == 255) {
							var10 = var3.readUnsignedIntIME();
						}

						if (var85 != null && var8 < var85.itemIds.length) {
							var85.itemIds[var8] = var9;
							var85.itemQuantities[var8] = var10;
						}

						ApproximateRouteStrategy.itemContainerSetItem(var5, var8, var9 - 1, var10);
					}

					if (var85 != null) {
						class110.invalidateWidget(var85);
					}

					PacketWriter.method3202();
					changedItemContainers[++field778 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3536 == var1.serverPacket) {
					UserComparator9.method3315(class323.field3415);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_INFO == var1.serverPacket) {
					playerUpdateManager.method3081(var3, var1.serverPacketLength);
					Occluder.method5269();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETSCROLLPOS == var1.serverPacket) {
					var21 = var3.readInt();
					var5 = var3.readUnsignedShortAdd();
					var85 = class416.widgetDefinition.method6911(var21);
					if (var85 != null && var85.type == 0) {
						if (var5 > var85.scrollHeight - var85.height) {
							var5 = var85.scrollHeight - var85.height;
						}

						if (var5 < 0) {
							var5 = 0;
						}

						if (var5 != var85.scrollY) {
							var85.scrollY = var5;
							class110.invalidateWidget(var85);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var23;
				InterfaceParent var34;
				if (ServerPacket.IF_MOVESUB == var1.serverPacket) {
					var21 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedIntIME();
					InterfaceParent var100 = (InterfaceParent)interfaceParents.get((long)var21);
					var34 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var34 != null) {
						class421.closeInterface(var34, var100 == null || var100.group != var34.group);
					}

					if (var100 != null) {
						var100.remove();
						interfaceParents.put(var100, (long)var5);
					}

					var23 = class416.widgetDefinition.method6911(var21);
					if (var23 != null) {
						class110.invalidateWidget(var23);
					}

					var23 = class416.widgetDefinition.method6911(var5);
					if (var23 != null) {
						class110.invalidateWidget(var23);
						SoundCache.revalidateWidgetScroll(class416.widgetDefinition.Widget_interfaceComponents[var23.id >>> 16], var23, true);
					}

					if (rootInterface != -1) {
						AbstractUserComparator.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3453 == var1.serverPacket) {
					UserComparator9.method3315(class323.field3423);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3513 == var1.serverPacket) {
					var21 = var3.readUnsignedShortLE();
					if (var21 == 65535) {
						var21 = -1;
					}

					var5 = var3.readUnsignedIntME();
					var6 = var3.readUnsignedShortAddLE();
					if (var6 == 65535) {
						var6 = -1;
					}

					var7 = var3.readUnsignedIntIME();

					for (var8 = var6; var8 <= var21; ++var8) {
						var28 = (long)var8 + ((long)var7 << 32);
						Node var92 = widgetFlags.get(var28);
						if (var92 != null) {
							var92.remove();
						}

						widgetFlags.put(new IntegerNode(var5), var28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3475 == var1.serverPacket) {
					UserComparator9.method3315(class323.field3422);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3469 == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					var5 = var3.readUnsignedShort();
					var6 = class555.field5457 >= 223 ? var3.readShort() : -1;
					if (var21 == 0) {
						GameEngine.entity = class198.topLevelWorldView.players[var5];
						field520 = -1;
					} else if (var21 == 1) {
						field520 = -1;
						GameEngine.entity = class198.topLevelWorldView.npcs[var5];
					} else if (var21 == 2) {
						field520 = var6;
						GameEngine.entity = class198.topLevelWorldView.worldEntities[var5];
						this.method620(true);
					}

					if (GameEngine.entity == null) {
						field520 = -1;
						GameEngine.entity = SpriteMask.localPlayer;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3566 == var1.serverPacket) {
					class532.method9809(class198.topLevelWorldView, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.EVENT_WORLDHOP == var1.serverPacket) {
					World var56 = new World();
					var56.host = var3.readStringCp1252NullTerminated();
					var56.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var56.properties = var5;
					if (var56.isDeadman()) {
						var56.field821 = "beta";
						field719 = true;
					} else {
						field719 = false;
					}

					BuddyRankComparator.updateGameState(45);
					var2.close();
					var2 = null;
					class372.changeWorld(var56);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.NPC_SET_SEQUENCE == var1.serverPacket) {
					var6 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedShort();
					var21 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					NPC var95 = class344.worldView.npcs[var21];
					if (var95 != null) {
						if (var5 == var95.sequence && var5 != -1) {
							var8 = Widget.SequenceDefinition_get(var5).restartMode;
							if (var8 == 1) {
								var95.sequenceFrame = 0;
								var95.sequenceFrameCycle = 0;
								var95.sequenceDelay = var6;
								var95.field1237 = 0;
							} else if (var8 == 2) {
								var95.field1237 = 0;
							}
						} else if (var5 == -1 || var95.sequence == -1 || Widget.SequenceDefinition_get(var5).field2320 >= Widget.SequenceDefinition_get(var95.sequence).field2320) {
							var95.sequence = var5;
							var95.sequenceFrame = 0;
							var95.sequenceFrameCycle = 0;
							var95.sequenceDelay = var6;
							var95.field1237 = 0;
							var95.field1291 = var95.pathLength;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3468 == var1.serverPacket) {
					PacketWriter.method3202();
					runEnergy = var3.readUnsignedShort();
					field705 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3447 == var1.serverPacket) {
					class134.field1572 = var3.readUnsignedByteSub();
					field734 = var3.readUnsignedByte();
					ItemLayer.field2480 = var3.readUnsignedByteNeg();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3574 == var1.serverPacket) {
					class180.field1896 = var3.readUnsignedByte();
					WorldMapIcon_1.field3094 = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				long var36;
				String var38;
				String var52;
				if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					var24 = var3.readLong();
					var26 = (long)var3.readUnsignedShort();
					var28 = (long)var3.readMedium();
					PlayerType var35 = (PlayerType)class177.findEnumerated(WorldMapEvent.PlayerType_values(), var3.readUnsignedByte());
					var36 = (var26 << 32) + var28;
					boolean var67 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (var36 == crossWorldMessageIds[var15]) {
							var67 = true;
							break;
						}
					}

					if (var35.isUser && ItemContainer.friendSystem.isIgnored(new Username(var52, WorldMapScaleHandler.loginType))) {
						var67 = true;
					}

					if (!var67 && field627 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var36;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var38 = AbstractFont.escapeBrackets(FileSystem.method4540(class416.method8056(var3)));
						if (var35.modIcon != -1) {
							class418.addChatMessage(9, Tiles.method2519(var35.modIcon) + var52, var38, Script.base37DecodeLong(var24));
						} else {
							class418.addChatMessage(9, var52, var38, Script.base37DecodeLong(var24));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG == var1.serverPacket) {
					var21 = var3.readUnsignedShortLE();
					if (var21 == 65535) {
						var21 = -1;
					}

					class353.playSong(var21);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3492 == var1.serverPacket) {
					var21 = var3.readUnsignedShortLE();
					if (var21 == 65535) {
						var21 = -1;
					}

					var5 = var3.method10139();
					HealthBarDefinition.method3942(var21, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3526 == var1.serverPacket) {
					class159.method3643();
					var69 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var69 >= 0) {
							currentClanSettings[var69] = null;
						} else {
							guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var69 >= 0) {
						currentClanSettings[var69] = new ClanSettings(var3);
					} else {
						guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3466 == var1.serverPacket) {
					field702 = cycleCntr;
					var69 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var69 >= 0) {
							currentClanChannels[var69] = null;
						} else {
							class158.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var69 >= 0) {
						currentClanChannels[var69] = new ClanChannel(var3);
					} else {
						class158.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3503 == var1.serverPacket) {
					var21 = var3.readUnsignedIntIME();
					var5 = var3.readInt();
					var85 = class416.widgetDefinition.method6911(var21);
					var85.field3936.method6942(var5);
					class110.invalidateWidget(var85);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					ScriptEvent.forceDisconnect(var21);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.IF_SETOBJECT == var1.serverPacket) {
					var21 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShortLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readUnsignedIntIME();
					var88 = class416.widgetDefinition.method6911(var21);
					ItemComposition var73;
					if (!var88.isIf3) {
						if (var5 == -1) {
							var88.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var73 = Bounds.ItemDefinition_get(var5).getCountObj(var6);
						var88.modelType = 4;
						var88.modelId = var5;
						var88.modelAngleX = var73.xan2d;
						var88.modelAngleY = var73.yan2d;
						var88.modelZoom = var73.zoom2d * 100 / var6;
						class110.invalidateWidget(var88);
					} else {
						var88.itemId = var5;
						var88.itemQuantity = var6;
						var73 = Bounds.ItemDefinition_get(var5).getCountObj(var6);
						var88.modelAngleX = var73.xan2d;
						var88.modelAngleY = var73.yan2d;
						var88.modelAngleZ = var73.zan2d;
						var88.modelOffsetX = var73.offsetX2d;
						var88.modelOffsetY = var73.offsetY2d;
						var88.modelZoom = var73.zoom2d;
						if (var73.isStackable == 1) {
							var88.itemQuantityMode = 1;
						} else {
							var88.itemQuantityMode = 2;
						}

						if (var88.field3923 > 0) {
							var88.modelZoom = var88.modelZoom * 32 / var88.field3923;
						} else if (var88.rawWidth > 0) {
							var88.modelZoom = var88.modelZoom * 32 / var88.rawWidth;
						}

						class110.invalidateWidget(var88);
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var12;
				if (ServerPacket.field3504 == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					var24 = (long)var3.readUnsignedShort();
					var26 = (long)var3.readMedium();
					PlayerType var98 = (PlayerType)class177.findEnumerated(WorldMapEvent.PlayerType_values(), var3.readUnsignedByte());
					long var40 = (var24 << 32) + var26;
					var12 = false;

					for (var66 = 0; var66 < 100; ++var66) {
						if (var40 == crossWorldMessageIds[var66]) {
							var12 = true;
							break;
						}
					}

					if (ItemContainer.friendSystem.isIgnored(new Username(var52, WorldMapScaleHandler.loginType))) {
						var12 = true;
					}

					if (!var12 && field627 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var40;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var31 = AbstractFont.escapeBrackets(FileSystem.method4540(class416.method8056(var3)));
						byte var65;
						if (var98.isPrivileged) {
							var65 = 7;
						} else {
							var65 = 3;
						}

						if (var98.modIcon != -1) {
							class430.addGameMessage(var65, Tiles.method2519(var98.modIcon) + var52, var31);
						} else {
							class430.addGameMessage(var65, var52, var31);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3497 == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByte();
					field765[var21] = true;
					field766[var21] = var5;
					field767[var21] = var6;
					field768[var21] = var7;
					field682[var21] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3541 == var1.serverPacket) {
					if (class544.field5379 == null) {
						class544.field5379 = new class496(class59.field406);
					}

					class566 var55 = class59.field406.method9326(var3);
					class544.field5379.field5123.vmethod9814(var55.field5528, var55.field5529);
					field696[++field697 - 1 & 31] = var55.field5528;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3465 == var1.serverPacket) {
					var21 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedShortAdd();
					var6 = var3.readUnsignedByteAdd();
					var34 = (InterfaceParent)interfaceParents.get((long)var21);
					if (var34 != null) {
						class421.closeInterface(var34, var5 != var34.group);
					}

					class88.openInterface(var21, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RUNCLIENTSCRIPT == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					Object[] var79 = new Object[var52.length() + 1];

					for (var6 = var52.length() - 1; var6 >= 0; --var6) {
						if (var52.charAt(var6) == 's') {
							var79[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var79[var6 + 1] = new Integer(var3.readInt());
						}
					}

					var79[0] = new Integer(var3.readInt());
					ScriptEvent var99 = new ScriptEvent();
					var99.args = var79;
					Ignored.runScriptEvent(var99);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3518 == var1.serverPacket) {
					AsyncHttpResponse.method267(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_SMALL_VIEWPORT_1 == var1.serverPacket) {
					class420.updateNpcs(class344.worldView, true, var3, 4);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3579 == var1.serverPacket) {
					class420.updateNpcs(class344.worldView, true, var3, 5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.GRAPHICSOBJECT_SPAWN == var1.serverPacket) {
					var9 = var3.readUnsignedShort();
					var10 = var3.readUnsignedByteSub();
					var11 = var3.readUnsignedShort();
					var6 = var3.method10137();
					var21 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var21 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					if (var7 >= 0 && var8 >= 0 && var7 < class344.worldView.sizeX && var8 < class344.worldView.sizeY) {
						var7 = Coord.method6854(var7);
						var8 = Coord.method6854(var8);
						GraphicsObject var30 = new GraphicsObject(var9, class344.worldView.plane, var7, var8, ScriptFrame.getTileHeight(class344.worldView, var7, var8, class344.worldView.plane) - var10, var11, cycle);
						class344.worldView.graphicsObjects.addFirst(var30);
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var83;
				if (ServerPacket.field3455 == var1.serverPacket) {
					var83 = var3.readUnsignedByte() == 1;
					if (var83) {
						Interpreter.field868 = class77.method2338() - var3.readLong();
						MusicSong.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						MusicSong.grandExchangeEvents = null;
					}

					field704 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3506 == var1.serverPacket) {
					var21 = var3.method10134();
					var5 = var3.readUnsignedIntME();
					var85 = class416.widgetDefinition.method6911(var5);
					if (var21 != var85.sequenceId || var21 == -1) {
						var85.sequenceId = var21;
						var85.modelFrame = 0;
						var85.modelFrameCycle = 0;
						class110.invalidateWidget(var85);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3487 == var1.serverPacket) {
					isCameraLocked = true;
					field748 = false;
					field738 = true;
					GrandExchangeOfferOwnWorldComparator.field468 = var3.readUnsignedByte();
					class390.field4583 = var3.readUnsignedByte();
					HorizontalAlignment.field1997 = var3.readUnsignedShort();
					var21 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = Coord.method6854(GrandExchangeOfferOwnWorldComparator.field468);
					var7 = Coord.method6854(class390.field4583);
					var8 = ScriptFrame.getTileHeight(class198.topLevelWorldView, var6, var7, class198.topLevelWorldView.plane) - HorizontalAlignment.field1997;
					var9 = var6 - AsyncHttpResponse.cameraX;
					var10 = var8 - FloorOverlayDefinition.cameraY;
					var11 = var7 - PlayerType.cameraZ;
					double var96 = Math.sqrt((double)(var11 * var11 + var9 * var9));
					var14 = GameEngine.method644((int)(Math.atan2((double)var10, var96) * 325.9490051269531D) & 2047);
					var15 = class156.method3622((int)(Math.atan2((double)var9, (double)var11) * -325.9490051269531D) & 2047);
					field763 = new class520(class323.cameraPitch, var14, var21, var5);
					field504 = new class520(class390.cameraYaw, var15, var21, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_LARGE == var1.serverPacket) {
					var21 = var3.readUnsignedShort();
					var5 = var3.readInt();
					Varps.Varps_temp[var21] = var5;
					if (Varps.Varps_main[var21] != var5) {
						Varps.Varps_main[var21] = var5;
					}

					class356.changeGameOptions(var21);
					changedVarps[++changedVarpCount - 1 & 31] = var21;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PING_STATISTICS_REQUEST == var1.serverPacket) {
					var21 = var3.readInt();
					var5 = var3.readInt();
					var6 = Strings.getGcDuration();
					PacketBufferNode var93 = class113.getPacketBufferNode(ClientPacket.PING_STATISTICS, packetWriter.isaacCipher);
					var93.packetBuffer.writeIntLE(var21);
					var93.packetBuffer.writeIntME(var5);
					var93.packetBuffer.writeByte(var6);
					var93.packetBuffer.writeByteAdd(GameEngine.fps);
					packetWriter.addNode(var93);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3516 == var1.serverPacket) {
					UserComparator9.method3315(class323.field3421);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3442 == var1.serverPacket) {
					var5 = var3.readUnsignedShortLE();
					var7 = var3.readUnsignedShort();
					var21 = var3.readUnsignedShortAdd();
					var8 = var3.readUnsignedShortAddLE();
					var6 = var3.readUnsignedShort();
					if (var21 == 65535) {
						var21 = -1;
					}

					ArrayList var39 = new ArrayList();
					var39.add(var21);
					WorldMapData_1.method6173(var39, var5, var6, var7, var8);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3470 == var1.serverPacket) {
					var21 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedIntME();
					var85 = class416.widgetDefinition.method6911(var5);
					var85.field3936.method6939(SpriteMask.localPlayer.appearance.gender, var21);
					class110.invalidateWidget(var85);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_CLIENT_VARCACHE == var1.serverPacket) {
					for (var21 = 0; var21 < ModelData0.field2933; ++var21) {
						VarpDefinition var78 = ReflectionCheck.VarpDefinition_get(var21);
						if (var78 != null) {
							Varps.Varps_temp[var21] = 0;
							Varps.Varps_main[var21] = 0;
						}
					}

					PacketWriter.method3202();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3559 == var1.serverPacket) {
					UserComparator9.method3315(class323.field3427);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3449 == var1.serverPacket) {
					UserComparator9.method3315(class323.field3418);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_REBOOT_TIMER == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShortAddLE() * 30;
					field705 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3551 == var1.serverPacket) {
					UserComparator9.method3315(class323.field3419);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3437 == var1.serverPacket) {
					var21 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedShortAddLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					class402.performPlayerAnimation(SpriteMask.localPlayer, var5, var21);
					var1.serverPacket = null;
					return true;
				}

				String var94;
				if (ServerPacket.MESSAGE_GAME == var1.serverPacket) {
					var21 = var3.readUShortSmart();
					var57 = var3.readUnsignedByte() == 1;
					var94 = "";
					boolean var60 = false;
					if (var57) {
						var94 = var3.readStringCp1252NullTerminated();
						if (ItemContainer.friendSystem.isIgnored(new Username(var94, WorldMapScaleHandler.loginType))) {
							var60 = true;
						}
					}

					String var71 = var3.readStringCp1252NullTerminated();
					if (!var60) {
						class430.addGameMessage(var21, var94, var71);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_PARTIAL == var1.serverPacket) {
					var21 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var21 < -70000) {
						var5 += 32768;
					}

					if (var21 >= 0) {
						var85 = class416.widgetDefinition.method6911(var21);
					} else {
						var85 = null;
					}

					for (; var3.offset < var1.serverPacketLength; ApproximateRouteStrategy.itemContainerSetItem(var5, var7, var8 - 1, var9)) {
						var7 = var3.readUShortSmart();
						var8 = var3.readUnsignedShort();
						var9 = 0;
						if (var8 != 0) {
							var9 = var3.readUnsignedByte();
							if (var9 == 255) {
								var9 = var3.readInt();
							}
						}

						if (var85 != null && var7 >= 0 && var7 < var85.itemIds.length) {
							var85.itemIds[var7] = var8;
							var85.itemQuantities[var7] = var9;
						}
					}

					if (var85 != null) {
						class110.invalidateWidget(var85);
					}

					PacketWriter.method3202();
					changedItemContainers[++field778 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REFLECTION_CHECKER == var1.serverPacket) {
					class276.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.URL_OPEN == var1.serverPacket) {
					byte[] var54 = new byte[var1.serverPacketLength];
					var3.method10035(var54, 0, var54.length);
					Buffer var76 = new Buffer(var54);
					var94 = var76.readStringCp1252NullTerminated();
					GrandExchangeOfferAgeComparator.openURL(var94, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3562 == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					var5 = var3.readUnsignedShort();
					this.method620(false);
					if (var21 == 0) {
						GameEngine.entity = class198.topLevelWorldView.players[var5];
					} else if (var21 == 1) {
						GameEngine.entity = class198.topLevelWorldView.npcs[var5];
					} else if (var21 == 2) {
						GameEngine.entity = class198.topLevelWorldView.worldEntities[var5];
						this.method620(true);
					}

					if (GameEngine.entity == null) {
						GameEngine.entity = SpriteMask.localPlayer;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETCOLOUR == var1.serverPacket) {
					var21 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedShortAddLE();
					var6 = var5 >> 10 & 31;
					var7 = var5 >> 5 & 31;
					var8 = var5 & 31;
					var9 = (var7 << 11) + (var6 << 19) + (var8 << 3);
					Widget var90 = class416.widgetDefinition.method6911(var21);
					if (var9 != var90.color) {
						var90.color = var9;
						class110.invalidateWidget(var90);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SYNC_CLIENT_VARCACHE == var1.serverPacket) {
					for (var21 = 0; var21 < Varps.Varps_main.length; ++var21) {
						if (Varps.Varps_temp[var21] != Varps.Varps_main[var21]) {
							Varps.Varps_main[var21] = Varps.Varps_temp[var21];
							class356.changeGameOptions(var21);
							changedVarps[++changedVarpCount - 1 & 31] = var21;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3439 == var1.serverPacket) {
					var21 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedIntIME();
					var6 = var3.readUnsignedByte();
					var88 = class416.widgetDefinition.method6911(var5);
					var88.field3936.method6926(var6, var21);
					class110.invalidateWidget(var88);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3482 == var1.serverPacket) {
					UserComparator9.method3315(class323.field3417);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3570 == var1.serverPacket) {
					AbstractWorldMapIcon.updateWorldEntitiesFromPacketBuffer(class344.worldView, var3, 1);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.HINT_ARROW == var1.serverPacket) {
					hintArrowType = var3.readUnsignedByte();
					if (hintArrowType == 1) {
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) {
						if (hintArrowType == 2) {
							hintArrowSubX = 64;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 3) {
							hintArrowSubX = 0;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 4) {
							hintArrowSubX = 128;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 5) {
							hintArrowSubX = 64;
							hintArrowSubY = 0;
						}

						if (hintArrowType == 6) {
							hintArrowSubX = 64;
							hintArrowSubY = 8192;
						}

						hintArrowType = 2;
						hintArrowX = var3.readUnsignedShort();
						hintArrowY = var3.readUnsignedShort();
						hintArrowHeight = var3.readUnsignedByte() * 2;
					}

					if (hintArrowType == 10) {
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3438 == var1.serverPacket) {
					UserComparator9.method3315(class323.field3426);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETPLAYERHEAD == var1.serverPacket) {
					var21 = var3.readUnsignedIntLE();
					var75 = class416.widgetDefinition.method6911(var21);
					var75.modelType = 3;
					var75.modelId = SpriteMask.localPlayer.appearance.getChatHeadId();
					class110.invalidateWidget(var75);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3568 == var1.serverPacket) {
					class344.worldView.npcCount = 0;
					class344.worldView.worldEntityCount = 0;

					for (var21 = 0; var21 < 65536; ++var21) {
						class344.worldView.npcs[var21] = null;
					}

					for (var21 = 0; var21 < 2048; ++var21) {
						class344.worldView.worldEntities[var21] = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETANGLE == var1.serverPacket) {
					var21 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShortLE();
					var6 = var3.readUnsignedShortLE();
					var7 = var3.readUnsignedIntIME();
					var23 = class416.widgetDefinition.method6911(var7);
					if (var5 != var23.modelAngleX || var6 != var23.modelAngleY || var21 != var23.modelZoom) {
						var23.modelAngleX = var5;
						var23.modelAngleY = var6;
						var23.modelZoom = var21;
						class110.invalidateWidget(var23);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3538 == var1.serverPacket) {
					++serverCycle;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3474 == var1.serverPacket) {
					var83 = var3.readBoolean();
					if (var83) {
						if (class77.field922 == null) {
							class77.field922 = new class402();
						}
					} else {
						class77.field922 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3478 == var1.serverPacket) {
					var21 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShort();
					var85 = class416.widgetDefinition.method6911(var21);
					if (var85.modelType != 6 || var5 != var85.modelId) {
						var85.modelType = 6;
						var85.modelId = var5;
						class110.invalidateWidget(var85);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_PRIVATE_ECHO == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					var22 = AbstractFont.escapeBrackets(FileSystem.method4540(class416.method8056(var3)));
					class430.addGameMessage(6, var52, var22);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3496 == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					VarbitComposition.method4123(var21);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PROJECTILE_SPAWN == var1.serverPacket) {
					var64 = var3.readUnsignedShort();
					var14 = var3.readUnsignedByteAdd() * 4;
					var66 = var3.readUnsignedByte() * 4;
					int var42 = var3.method10108();
					var17 = var3.readUnsignedByteNeg();
					var6 = var3.method10139();
					var21 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var21 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var15 = var3.readUnsignedShort();
					var16 = var3.readUnsignedShortAddLE();
					var18 = var3.readUnsignedShortAddLE();
					var61 = var3.readByteNeg();
					var11 = var3.method10141();
					var63 = var3.readByteAdd();
					var9 = var61 + var7;
					var10 = var63 + var8;
					if (0 <= var7 && var7 < 104 && 0 <= var8 && var8 < 104 && 0 <= var9 && var9 < 104 && 0 <= var10 && var10 < 104 && var64 != 65535) {
						var7 = Coord.method6854(var7);
						var8 = Coord.method6854(var8);
						var9 = Coord.method6854(var9);
						var10 = Coord.method6854(var10);
						Projectile var20 = new Projectile(var64, class344.worldView.plane, var7, var8, ScriptFrame.getTileHeight(class344.worldView, var7, var8, class344.worldView.plane) - var66, var15 + cycle, var16 + cycle, var17, var18, var42, var11, var14);
						var20.setDestination(var9, var10, ScriptFrame.getTileHeight(class344.worldView, var9, var10, class344.worldView.plane) - var14, var15 + cycle);
						class344.worldView.projectiles.addFirst(var20);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_FULL_FOLLOWS == var1.serverPacket) {
					field734 = var3.readUnsignedByteAdd();
					class134.field1572 = var3.readUnsignedByteNeg();
					ItemLayer.field2480 = var3.readUnsignedByteNeg();

					for (var21 = ItemLayer.field2480; var21 < ItemLayer.field2480 + 8; ++var21) {
						for (var5 = class134.field1572; var5 < class134.field1572 + 8; ++var5) {
							if (class344.worldView.groundItems[field734][var21][var5] != null) {
								class344.worldView.groundItems[field734][var21][var5] = null;
								class397.updateItemPile(field734, var21, var5);
							}
						}
					}

					for (PendingSpawn var53 = (PendingSpawn)class344.worldView.pendingSpawns.last(); var53 != null; var53 = (PendingSpawn)class344.worldView.pendingSpawns.previous()) {
						if (var53.x >= ItemLayer.field2480 && var53.x < ItemLayer.field2480 + 8 && var53.y >= class134.field1572 && var53.y < class134.field1572 + 8 && var53.plane == field734) {
							var53.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PLAYER_OP == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					var5 = var3.readUnsignedByteSub();
					var6 = var3.readUnsignedByteSub();
					if (var6 >= 1 && var6 <= 8) {
						if (var52.equalsIgnoreCase("null")) {
							var52 = null;
						}

						playerMenuActions[var6 - 1] = var52;
						playerOptionsPriorities[var6 - 1] = var5 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_MOVETO == var1.serverPacket) {
					isCameraLocked = true;
					field748 = false;
					field648 = true;
					ClanChannel.field1843 = var3.readUnsignedByte();
					UserComparator6.field1525 = var3.readUnsignedByte();
					var21 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					field760 = var3.readBoolean();
					var6 = var3.readUnsignedByte();
					var7 = Coord.method6854(ClanChannel.field1843);
					var8 = Coord.method6854(UserComparator6.field1525);
					boolean var58 = false;
					boolean var59 = false;
					if (field760) {
						var9 = FloorOverlayDefinition.cameraY;
						var10 = ScriptFrame.getTileHeight(class198.topLevelWorldView, var7, var8, class198.topLevelWorldView.plane) - var21;
					} else {
						var9 = ScriptFrame.getTileHeight(class198.topLevelWorldView, AsyncHttpResponse.cameraX, PlayerType.cameraZ, class198.topLevelWorldView.plane) - FloorOverlayDefinition.cameraY;
						var10 = var21;
					}

					field761 = new class519(AsyncHttpResponse.cameraX, PlayerType.cameraZ, var9, var7, var8, var10, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETHIDE == var1.serverPacket) {
					var21 = var3.readInt();
					var57 = var3.readUnsignedByte() == 1;
					var85 = class416.widgetDefinition.method6911(var21);
					if (var57 != var85.isHidden) {
						var85.isHidden = var57;
						class110.invalidateWidget(var85);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT_FULL == var1.serverPacket) {
					class389.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3529 == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					var5 = var3.readUnsignedIntIME();
					var85 = class416.widgetDefinition.method6911(var5);
					if (!var52.equals(var85.text)) {
						var85.text = var52;
						class110.invalidateWidget(var85);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3540 == var1.serverPacket) {
					isCameraLocked = true;
					field748 = false;
					field648 = false;
					ClanChannel.field1843 = var3.readUnsignedByte();
					UserComparator6.field1525 = var3.readUnsignedByte();
					class319.field3307 = var3.readUnsignedShort();
					Message.field461 = var3.readUnsignedByte();
					HttpResponse.field82 = var3.readUnsignedByte();
					if (HttpResponse.field82 >= 100) {
						AsyncHttpResponse.cameraX = Coord.method6854(ClanChannel.field1843);
						PlayerType.cameraZ = Coord.method6854(UserComparator6.field1525);
						FloorOverlayDefinition.cameraY = ScriptFrame.getTileHeight(class198.topLevelWorldView, AsyncHttpResponse.cameraX, PlayerType.cameraZ, class198.topLevelWorldView.plane) - class319.field3307;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3477 == var1.serverPacket) {
					class544.field5379 = new class496(class59.field406);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3573 == var1.serverPacket) {
					var21 = var3.readShort();
					class492 var74 = (class492)class177.findEnumerated(class390.method7608(), var3.readUnsignedByte());
					class491 var87 = (class491)class177.findEnumerated(GrandExchangeOfferUnitPriceComparator.method7811(), var3.readUnsignedByte());
					if (var21 == -2) {
						worldViewManager.method2672(var74, var87);
					} else {
						worldViewManager.method2673(var21, var74, var87);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3577 == var1.serverPacket) {
					return this.method1492(var1, 1);
				}

				if (ServerPacket.field3537 == var1.serverPacket) {
					class159.method3643();
					var69 = var3.readByte();
					class153 var72 = new class153(var3);
					ClanSettings var86;
					if (var69 >= 0) {
						var86 = currentClanSettings[var69];
					} else {
						var86 = guestClanSettings;
					}

					if (var86 == null) {
						this.method1878(var69);
						var1.serverPacket = null;
						return true;
					}

					if (var72.field1715 > var86.field1767) {
						this.method1878(var69);
						var1.serverPacket = null;
						return true;
					}

					if (var72.field1715 < var86.field1767) {
						var1.serverPacket = null;
						return true;
					}

					var72.method3596(var86);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3479 == var1.serverPacket) {
					var21 = var3.readInt();
					var5 = var3.readUnsignedShortLE();
					var6 = var3.readUnsignedShortAdd();
					var88 = class416.widgetDefinition.method6911(var21);
					var88.field3905 = var5 + (var6 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3576 == var1.serverPacket) {
					AbstractWorldMapIcon.updateWorldEntitiesFromPacketBuffer(class344.worldView, var3, 3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3561 == var1.serverPacket) {
					isCameraLocked = true;
					field748 = false;
					field738 = true;
					var21 = var3.readShort();
					var5 = var3.readShort();
					var6 = GameEngine.method644(var5 + class323.cameraPitch & 2027);
					var7 = var21 + class390.cameraYaw;
					var8 = var3.readUnsignedShort();
					var9 = var3.readUnsignedByte();
					field763 = new class520(class323.cameraPitch, var6, var8, var9);
					field504 = new class520(class390.cameraYaw, var7, var8, var9);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3481 == var1.serverPacket) {
					var21 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedShort();
					class167.method3766(var21, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3572 == var1.serverPacket) {
					field633 = var3.readStringCp1252NullTerminated();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3440 == var1.serverPacket) {
					isCameraLocked = true;
					field748 = false;
					field648 = true;
					ClanChannel.field1843 = var3.readUnsignedByte();
					UserComparator6.field1525 = var3.readUnsignedByte();
					var21 = var3.readUnsignedShort();
					var5 = Coord.method6854(var3.readUnsignedByte());
					var6 = Coord.method6854(var3.readUnsignedByte());
					var7 = var3.readUnsignedShort();
					field760 = var3.readBoolean();
					var8 = var3.readUnsignedByte();
					var9 = Coord.method6854(ClanChannel.field1843);
					var10 = Coord.method6854(UserComparator6.field1525);
					var62 = false;
					var12 = false;
					if (field760) {
						var11 = FloorOverlayDefinition.cameraY;
						var64 = ScriptFrame.getTileHeight(class198.topLevelWorldView, var9, var10, class198.topLevelWorldView.plane) - var21;
					} else {
						var11 = ScriptFrame.getTileHeight(class198.topLevelWorldView, AsyncHttpResponse.cameraX, PlayerType.cameraZ, class198.topLevelWorldView.plane) - FloorOverlayDefinition.cameraY;
						var64 = var21;
					}

					field761 = new class518(AsyncHttpResponse.cameraX, PlayerType.cameraZ, var11, var9, var10, var64, var5, var6, var7, var8);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3458 == var1.serverPacket) {
					class172.field1855 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3512 == var1.serverPacket && isCameraLocked) {
					field748 = true;
					field738 = false;
					field648 = false;

					for (var21 = 0; var21 < 5; ++var21) {
						field765[var21] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETNPCHEAD == var1.serverPacket) {
					var21 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShort();
					var85 = class416.widgetDefinition.method6911(var21);
					if (var85.modelType != 2 || var5 != var85.modelId) {
						var85.modelType = 2;
						var85.modelId = var5;
						class110.invalidateWidget(var85);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_NORMAL == var1.serverPacket) {
					WallDecoration.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIENDLIST == var1.serverPacket) {
					ItemContainer.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field586 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3521 == var1.serverPacket) {
					ItemContainer.friendSystem.method2005();
					field586 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_FRIENDS_CHAT == var1.serverPacket) {
					var69 = var3.readByte();
					var22 = var3.readStringCp1252NullTerminated();
					long var43 = (long)var3.readUnsignedShort();
					long var45 = (long)var3.readMedium();
					PlayerType var89 = (PlayerType)class177.findEnumerated(WorldMapEvent.PlayerType_values(), var3.readUnsignedByte());
					long var47 = var45 + (var43 << 32);
					boolean var13 = false;
					ClanChannel var49 = null;
					var49 = var69 >= 0 ? currentClanChannels[var69] : class158.guestClanChannel;
					if (var49 == null) {
						var13 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var89.isUser && ItemContainer.friendSystem.isIgnored(new Username(var22, WorldMapScaleHandler.loginType))) {
									var13 = true;
								}
								break;
							}

							if (var47 == crossWorldMessageIds[var15]) {
								var13 = true;
								break;
							}

							++var15;
						}
					}

					if (!var13) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var47;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var38 = AbstractFont.escapeBrackets(class416.method8056(var3));
						var16 = var69 >= 0 ? 41 : 44;
						if (var89.modIcon != -1) {
							class418.addChatMessage(var16, Tiles.method2519(var89.modIcon) + var22, var38, var49.name);
						} else {
							class418.addChatMessage(var16, var22, var38, var49.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETMODEL == var1.serverPacket) {
					var21 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedIntLE();
					var85 = class416.widgetDefinition.method6911(var5);
					if (var85.modelType != 1 || var21 != var85.modelId) {
						var85.modelType = 1;
						var85.modelId = var21;
						class110.invalidateWidget(var85);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3490 == var1.serverPacket) {
					return this.method1457(var1);
				}

				if (ServerPacket.field3555 == var1.serverPacket) {
					var21 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.method1334(false);
						class187.method3964(rootInterface);
						LoginState.runWidgetOnLoadListener(rootInterface);

						for (var7 = 0; var7 < 100; ++var7) {
							validRootWidgets[var7] = true;
						}
					}

					InterfaceParent var33;
					for (; var6-- > 0; var33.field1095 = true) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedByte();
						var33 = (InterfaceParent)interfaceParents.get((long)var7);
						if (var33 != null && var8 != var33.group) {
							class421.closeInterface(var33, true);
							var33 = null;
						}

						if (var33 == null) {
							var33 = class88.openInterface(var7, var8, var9);
						}
					}

					for (var34 = (InterfaceParent)interfaceParents.first(); var34 != null; var34 = (InterfaceParent)interfaceParents.next()) {
						if (var34.field1095) {
							var34.field1095 = false;
						} else {
							class421.closeInterface(var34, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var21) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedShort();
						var10 = var3.readInt();

						for (var11 = var8; var11 <= var9; ++var11) {
							var36 = ((long)var7 << 32) + (long)var11;
							widgetFlags.put(new IntegerNode(var10), var36);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3524 == var1.serverPacket) {
					field702 = cycleCntr;
					var69 = var3.readByte();
					class167 var70 = new class167(var3);
					ClanChannel var32;
					if (var69 >= 0) {
						var32 = currentClanChannels[var69];
					} else {
						var32 = class158.guestClanChannel;
					}

					if (var32 == null) {
						this.method1846(var69);
						var1.serverPacket = null;
						return true;
					}

					if (var70.field1818 > var32.field1836) {
						this.method1846(var69);
						var1.serverPacket = null;
						return true;
					}

					if (var70.field1818 < var32.field1836) {
						var1.serverPacket = null;
						return true;
					}

					var70.method3768(var32);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_STOP_TRANSIT == var1.serverPacket) {
					var21 = var3.readUnsignedShortAddLE();
					TileItem.method3067(var21);
					changedItemContainers[++field778 - 1 & 31] = var21 & 32767;
					var1.serverPacket = null;
					return true;
				}

				HttpHeaders.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1479 != null ? var1.field1479.id : -1) + "," + (var1.field1480 != null ? var1.field1480.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				class389.logOut();
			} catch (IOException var50) {
				WorldMapSectionType.method6254();
			} catch (Exception var51) {
				var22 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1479 != null ? var1.field1479.id : -1) + "," + (var1.field1480 != null ? var1.field1480.id : -1) + "," + var1.serverPacketLength + "," + (SpriteMask.localPlayer.pathX[0] + class198.topLevelWorldView.baseX) + "," + (SpriteMask.localPlayer.pathY[0] + class198.topLevelWorldView.baseY) + ",";

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) {
					var22 = var22 + var3.array[var6] + ",";
				}

				HttpHeaders.RunException_sendStackTrace(var22, var51);
				class389.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1613932559"
	)
	@Export("menu")
	final void menu() {
		StructComposition.method4174(menu);
		if (clickedWidget == null) {
			int var1 = MouseHandler.MouseHandler_lastButton;
			if (isMenuOpen) {
				if (var1 != 1 && (class150.mouseCam || var1 != 4) && !menu.method10809(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y)) {
					isMenuOpen = false;
					menu.invalidateWidgetsUnder();
				}

				if (var1 == 1 || !class150.mouseCam && var1 == 4) {
					menu.method10764(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					isMenuOpen = false;
					menu.invalidateWidgetsUnder();
				}
			} else if (menu.menuOptionsCount > 0) {
				int var2 = MusicPatchPcmStream.method6792();
				if ((var1 == 1 || !class150.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu(menu.menuOpcodes[var2], menu.menuShiftClick[var2])) {
					var1 = 2;
				}

				if (var1 == 1 || !class150.mouseCam && var1 == 4) {
					menu.method10797(var2);
				}

				if (var1 == 2) {
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(IZI)Z",
		garbageValue = "1281290468"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu(int var1, boolean var2) {
		return (leftClickOpensMenu && menu.menuOptionsCount > 2 || class149.method3568(var1)) && !var2;
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-765988988"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		menu.method10759(var1, var2);
		var1 -= viewportOffsetX;
		var2 -= viewportOffsetY;
		Iterator var3 = worldViewManager.iterator();

		while (var3.hasNext()) {
			WorldView var4 = (WorldView)var3.next();
			var4.scene.menuOpen(false);
		}

		isMenuOpen = true;
		menu.method10765();
	}

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "99"
	)
	final void method1334(boolean var1) {
		class271.method5725(rootInterface, HttpRequestTask.canvasWidth, class268.canvasHeight, var1);
	}

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)V",
		garbageValue = "631896716"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : class416.widgetDefinition.method6911(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = HttpRequestTask.canvasWidth;
			var4 = class268.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		class145.alignWidgetSize(var1, var3, var4, false);
		class319.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1596945501"
	)
	final void method1332() {
		class110.invalidateWidget(clickedWidget);
		++InterfaceParent.widgetDragDuration;
		int var1;
		int var2;
		if (field691 && field558) {
			var1 = MouseHandler.MouseHandler_x;
			var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field758) {
				var1 = field758;
			}

			if (var1 + clickedWidget.width > field758 + clickedWidgetParent.width) {
				var1 = field758 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field684) {
				var2 = field684;
			}

			if (clickedWidget.height + var2 > clickedWidgetParent.height + field684) {
				var2 = clickedWidgetParent.height + field684 - clickedWidget.height;
			}

			int var3 = var1 - field686;
			int var4 = var2 - field521;
			int var5 = clickedWidget.dragZoneSize;
			if (InterfaceParent.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field758 + clickedWidgetParent.scrollX;
			int var7 = var2 - field684 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				Ignored.runScriptEvent(var8);
			}

			if (MouseHandler.MouseHandler_currentButton == 0) {
				if (isDraggingWidget) {
					if (clickedWidget.onDragComplete != null) {
						var8 = new ScriptEvent();
						var8.widget = clickedWidget;
						var8.mouseX = var6;
						var8.mouseY = var7;
						var8.dragTarget = draggedOnWidget;
						var8.args = clickedWidget.onDragComplete;
						Ignored.runScriptEvent(var8);
					}

					if (draggedOnWidget != null && class437.method8555(clickedWidget) != null) {
						PacketBufferNode var11 = class113.getPacketBufferNode(ClientPacket.OPHELDD, packetWriter.isaacCipher);
						var11.packetBuffer.writeIntIME(clickedWidget.id);
						var11.packetBuffer.writeIntME(draggedOnWidget.id);
						var11.packetBuffer.writeShortAdd(draggedOnWidget.childIndex);
						var11.packetBuffer.writeShortAdd(clickedWidget.itemId);
						var11.packetBuffer.writeShort(draggedOnWidget.itemId);
						var11.packetBuffer.writeShort(clickedWidget.childIndex);
						packetWriter.addNode(var11);
					}
				} else if (class179.tempMenuAction != null && !this.shouldLeftClickOpenMenu(class179.tempMenuAction.opcode, class179.tempMenuAction.field909)) {
					if (menu.menuOptionsCount > 0) {
						int var10 = widgetClickX + field686;
						int var9 = field521 + widgetClickY;
						ApproximateRouteStrategy.method1258(class179.tempMenuAction, var10, var9);
						class179.tempMenuAction = null;
					}
				} else {
					this.openMenu(widgetClickX + field686, field521 + widgetClickY);
				}

				clickedWidget = null;
			}

		} else {
			if (InterfaceParent.widgetDragDuration > 1) {
				if (!isDraggingWidget && menu.menuOptionsCount > 0) {
					var1 = field686 + widgetClickX;
					var2 = widgetClickY + field521;
					ApproximateRouteStrategy.method1258(class179.tempMenuAction, var1, var2);
					class179.tempMenuAction = null;
				}

				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "(I)Lwx;",
		garbageValue = "738744592"
	)
	@Export("username")
	public Username username() {
		return SpriteMask.localPlayer != null ? SpriteMask.localPlayer.username : null;
	}

	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1377226534"
	)
	void method1846(int var1) {
		PacketBufferNode var2 = class113.getPacketBufferNode(ClientPacket.field3394, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
	}

	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "391081597"
	)
	void method1878(int var1) {
		PacketBufferNode var2 = class113.getPacketBufferNode(ClientPacket.field3330, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
	}

	public final void init() {
		try {
			if (this.checkHost()) {
				for (int var1 = 0; var1 <= 28; ++var1) {
					String var2 = this.getParameter(Integer.toString(var1));
					if (var2 != null) {
						switch(var1) {
						case 3:
							if (var2.equalsIgnoreCase("true")) {
								isMembersWorld = true;
							} else {
								isMembersWorld = false;
							}
							break;
						case 4:
							if (clientType == -1) {
								clientType = Integer.parseInt(var2);
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2);
							break;
						case 6:
							WorldMapCacheName.clientLanguage = Language.method7848(Integer.parseInt(var2));
							break;
						case 7:
							int var4 = Integer.parseInt(var2);
							GameBuild[] var5 = new GameBuild[]{GameBuild.LIVE, GameBuild.WIP, GameBuild.BUILDLIVE, GameBuild.RC};
							GameBuild[] var6 = var5;
							int var7 = 0;

							GameBuild var3;
							while (true) {
								if (var7 >= var6.length) {
									var3 = null;
									break;
								}

								GameBuild var8 = var6[var7];
								if (var4 == var8.buildId) {
									var3 = var8;
									break;
								}

								++var7;
							}

							StructComposition.field2141 = var3;
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							class145.field1668 = var2;
							break;
						case 10:
							WorldMapRenderer.field3156 = (StudioGame)class177.findEnumerated(AsyncHttpResponse.method278(), Integer.parseInt(var2));
							if (StudioGame.oldscape == WorldMapRenderer.field3156) {
								WorldMapScaleHandler.loginType = LoginType.oldscape;
							} else {
								WorldMapScaleHandler.loginType = LoginType.field5343;
							}
							break;
						case 11:
							StudioGame.authServiceBaseUrl = var2;
							break;
						case 12:
							worldId = Integer.parseInt(var2);
						case 13:
						case 16:
						case 18:
						case 19:
						case 20:
						case 23:
						case 24:
						default:
							break;
						case 14:
							BZip2State.field5507 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							ScriptFrame.field447 = var2;
							break;
						case 21:
							field537 = Integer.parseInt(var2);
							break;
						case 22:
							class149.gameSessionServiceBaseUrl = var2;
							break;
						case 25:
							int var9 = var2.indexOf(".");
							if (var9 == -1) {
								class555.field5457 = Integer.parseInt(var2);
							} else {
								class555.field5457 = Integer.parseInt(var2.substring(0, var9));
								Integer.parseInt(var2.substring(var9 + 1));
							}
						}
					}
				}

				FaceNormal.method5260();
				class156.worldHost = this.getCodeBase().getHost();
				class376.field4123 = new JagNetThread();
				String var10 = StructComposition.field2141.name;
				byte var11 = 0;
				if ((worldProperties & class552.field5430.rsOrdinal()) != 0) {
					class147.field1688 = "beta";
				}

				try {
					PendingSpawn.method2712("oldschool", class147.field1688, var10, var11, 23);
				} catch (Exception var12) {
					HttpHeaders.RunException_sendStackTrace((String)null, var12);
				}

				Projectile.client = this;
				HealthBarConfig.field1367 = clientType;
				Skeleton.accessToken = System.getenv("JX_ACCESS_TOKEN");
				WorldMapID.refreshToken = System.getenv("JX_REFRESH_TOKEN");
				WorldMapArea.sessionId = System.getenv("JX_SESSION_ID");
				ByteArrayPool.characterId = System.getenv("JX_CHARACTER_ID");
				class165.method3755(System.getenv("JX_DISPLAY_NAME"));
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
					this.https = true;
				}

				if (field508 == -1) {
					if (!this.containsAccessAndRefreshToken() && !this.containsSessionAndCharacterId()) {
						field508 = 0;
					} else {
						field508 = 5;
					}
				}

				this.startThread(765, 503, 226, 1);
			}
		} catch (RuntimeException var13) {
			throw class508.newRunException(var13, "client.init(" + ')');
		}
	}

	public void setClient(int var1) {
		this.clientId = var1;
	}

	public boolean isOnLoginScreen() {
		return gameState == 10;
	}

	public long getAccountHash() {
		return this.accountHash;
	}

	protected void finalize() throws Throwable {
		class333.field3627.remove(this);
		super.finalize();
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
	)
	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) {
			this.otlTokenRequester = var1;
			class6.updateLoginIndex(10);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) {
			this.refreshAccessTokenRequester = var1;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Lce;",
		garbageValue = "84584003"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lvc;",
		garbageValue = "-2034883816"
	)
	public static IndexedSprite method1956() {
		IndexedSprite var0 = new IndexedSprite();
		var0.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
		var0.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
		var0.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[0];
		var0.yOffset = class497.SpriteBuffer_yOffsets[0];
		var0.subWidth = class7.SpriteBuffer_spriteWidths[0];
		var0.subHeight = SpriteBufferProperties.SpriteBuffer_spriteHeights[0];
		var0.palette = SpriteBufferProperties.SpriteBuffer_spritePalette;
		var0.pixels = class280.SpriteBuffer_pixels[0];
		SpriteBufferProperties.SpriteBuffer_xOffsets = null;
		class497.SpriteBuffer_yOffsets = null;
		class7.SpriteBuffer_spriteWidths = null;
		SpriteBufferProperties.SpriteBuffer_spriteHeights = null;
		SpriteBufferProperties.SpriteBuffer_spritePalette = null;
		class280.SpriteBuffer_pixels = null;
		return var0;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZI)I",
		garbageValue = "-739306786"
	)
	static int method1952(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) {
			var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = indexCheck.isValidIndexInRange(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = indexCheck.method5651(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = indexCheck.method5653(var3) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Ldn;IIIII)V",
		garbageValue = "-1747837942"
	)
	static final void method1954(WorldView var0, int var1, int var2, int var3, int var4) {
		overheadTextCount = 0;
		boolean var5 = false;
		int var6 = -1;
		int var7 = -1;
		int var8 = playerUpdateManager.playerCount;
		int[] var9 = playerUpdateManager.playerIndices;

		int var10;
		for (var10 = 0; var10 < var8 + var0.npcCount; ++var10) {
			Object var23;
			if (var10 < var8) {
				var23 = var0.players[var9[var10]];
				if (var9[var10] == combatTargetPlayerIndex) {
					var5 = true;
					var6 = var10;
					continue;
				}

				if (var23 == SpriteMask.localPlayer) {
					var7 = var10;
					continue;
				}
			} else {
				var23 = var0.npcs[var0.npcIndices[var10 - var8]];
			}

			Message.drawActor2d(var0, (Actor)var23, var10, var1, var2, var3, var4);
		}

		if (renderSelf && var7 != -1) {
			Message.drawActor2d(var0, SpriteMask.localPlayer, var7, var1, var2, var3, var4);
		}

		if (var5) {
			Message.drawActor2d(var0, var0.players[combatTargetPlayerIndex], var6, var1, var2, var3, var4);
		}

		for (var10 = 0; var10 < overheadTextCount; ++var10) {
			int var11 = overheadTextXs[var10];
			int var12 = overheadTextYs[var10];
			int var13 = overheadTextXOffsets[var10];
			int var14 = overheadTextAscents[var10];
			boolean var15 = true;

			while (var15) {
				var15 = false;

				for (int var22 = 0; var22 < var10; ++var22) {
					if (var12 + 2 > overheadTextYs[var22] - overheadTextAscents[var22] && var12 - var14 < overheadTextYs[var22] + 2 && var11 - var13 < overheadTextXOffsets[var22] + overheadTextXs[var22] && var11 + var13 > overheadTextXs[var22] - overheadTextXOffsets[var22] && overheadTextYs[var22] - overheadTextAscents[var22] < var12) {
						var12 = overheadTextYs[var22] - overheadTextAscents[var22];
						var15 = true;
					}
				}
			}

			viewportTempX = overheadTextXs[var10];
			viewportTempY = overheadTextYs[var10] = var12;
			String var16 = overheadText[var10];
			if (chatEffects == 0) {
				int var17 = 16776960;
				if (overheadTextColors[var10] < 6) {
					var17 = field771[overheadTextColors[var10]];
				}

				if (overheadTextColors[var10] == 6) {
					var17 = viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (overheadTextColors[var10] == 7) {
					var17 = viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (overheadTextColors[var10] == 8) {
					var17 = viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var18;
				if (overheadTextColors[var10] == 9) {
					var18 = 150 - overheadTextCyclesRemaining[var10];
					if (var18 < 50) {
						var17 = var18 * 1280 + 16711680;
					} else if (var18 < 100) {
						var17 = 16776960 - (var18 - 50) * 327680;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 65280;
					}
				}

				if (overheadTextColors[var10] == 10) {
					var18 = 150 - overheadTextCyclesRemaining[var10];
					if (var18 < 50) {
						var17 = var18 * 5 + 16711680;
					} else if (var18 < 100) {
						var17 = 16711935 - (var18 - 50) * 327680;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 327680 + 255 - (var18 - 100) * 5;
					}
				}

				if (overheadTextColors[var10] == 11) {
					var18 = 150 - overheadTextCyclesRemaining[var10];
					if (var18 < 50) {
						var17 = 16777215 - var18 * 327685;
					} else if (var18 < 100) {
						var17 = (var18 - 50) * 327685 + 65280;
					} else if (var18 < 150) {
						var17 = 16777215 - (var18 - 100) * 327680;
					}
				}

				int var19;
				if (overheadTextColors[var10] == 12 && field665[var10] == null) {
					var18 = var16.length();
					field665[var10] = new int[var18];

					for (var19 = 0; var19 < var18; ++var19) {
						int var20 = (int)((float)var19 / (float)var18 * 64.0F);
						int var21 = var20 << 10 | 896 | 64;
						field665[var10][var19] = class508.field5157[var21];
					}
				}

				if (overheadTextEffects[var10] == 0) {
					Calendar.fontBold12.method8606(var16, viewportTempX + var1, var2 + viewportTempY, var17, 0, field665[var10]);
				}

				if (overheadTextEffects[var10] == 1) {
					Calendar.fontBold12.method8658(var16, viewportTempX + var1, var2 + viewportTempY, var17, 0, viewportDrawCount, field665[var10]);
				}

				if (overheadTextEffects[var10] == 2) {
					Calendar.fontBold12.method8574(var16, viewportTempX + var1, var2 + viewportTempY, var17, 0, viewportDrawCount, field665[var10]);
				}

				if (overheadTextEffects[var10] == 3) {
					Calendar.fontBold12.method8575(var16, viewportTempX + var1, var2 + viewportTempY, var17, 0, viewportDrawCount, 150 - overheadTextCyclesRemaining[var10], field665[var10]);
				}

				if (overheadTextEffects[var10] == 4) {
					var18 = (150 - overheadTextCyclesRemaining[var10]) * (Calendar.fontBold12.stringWidth(var16) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(viewportTempX + var1 - 50, var2, viewportTempX + var1 + 50, var2 + var4);
					Calendar.fontBold12.method8577(var16, viewportTempX + var1 + 50 - var18, var2 + viewportTempY, var17, 0, field665[var10]);
					Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4);
				}

				if (overheadTextEffects[var10] == 5) {
					var18 = 150 - overheadTextCyclesRemaining[var10];
					var19 = 0;
					if (var18 < 25) {
						var19 = var18 - 25;
					} else if (var18 > 125) {
						var19 = var18 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var1, var2 + viewportTempY - Calendar.fontBold12.ascent - 1, var3 + var1, var2 + viewportTempY + 5);
					Calendar.fontBold12.method8606(var16, viewportTempX + var1, var19 + var2 + viewportTempY, var17, 0, field665[var10]);
					Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4);
				}
			} else {
				Calendar.fontBold12.drawCentered(var16, viewportTempX + var1, var2 + viewportTempY, 16776960, 0);
			}
		}

	}

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "49"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return tapToDrop;
	}
}
