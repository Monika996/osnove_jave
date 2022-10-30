package handlers;

import common.Type;
import handlers.Approver;
import handlers.Manager;

/**
 * Execution class of the application. Be free to modify below line 14 (bellow
 * comment line)
 */
public class PurchaseApprovalExecutor {

	public static void execute() {
		Approver manager = new Manager();
		ApprovalChainGenerator.generate(manager);
		// Be free to modify method below this line

		manager.approve(1, 300, Type.CONSUMABLES);
		manager.approve(2, 500, Type.CLERICAL);
		manager.approve(3, 1000, Type.GADGETS);
		manager.approve(4, 3000, Type.GAMING);
		manager.approve(5, 5000, Type.PC);

		System.out.println();

		// Director approval

		Approver director = new Director();
		ApprovalChainGenerator.generate(director);

		director.approve(1, 500, Type.CONSUMABLES);
		director.approve(2, 1000, Type.CLERICAL);
		director.approve(3, 1500, Type.GADGETS);
		director.approve(4, 3500, Type.GAMING);
		director.approve(5, 6000, Type.PC);

		System.out.println();

		// Vice President approval

		Approver vicePresident = new VicePresident();
		ApprovalChainGenerator.generate(vicePresident);

		vicePresident.approve(1, 700, Type.CONSUMABLES);
		vicePresident.approve(2, 1500, Type.CLERICAL);
		vicePresident.approve(3, 2000, Type.GADGETS);
		vicePresident.approve(4, 4500, Type.GAMING);
		vicePresident.approve(5, 6500, Type.PC);

		System.out.println();

		// President approval

		Approver president = new President();
		ApprovalChainGenerator.generate(president);

		president.approve(1, 1000, Type.CONSUMABLES);
		president.approve(2, 2000, Type.CLERICAL);
		president.approve(3, 3000, Type.GADGETS);
		president.approve(4, 5000, Type.GAMING);
		president.approve(5, 8000, Type.PC);

		System.out.println();
		System.out.println("Everything else requires an approval of executive meeting");

	}

}