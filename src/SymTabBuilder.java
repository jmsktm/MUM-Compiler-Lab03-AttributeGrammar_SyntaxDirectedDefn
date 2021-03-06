import analysis.DepthFirstAdapter;
import node.*;

public class SymTabBuilder extends DepthFirstAdapter {

	private SymbolTable symtab;

	public SymTabBuilder() {
		super();
		
		symtab = new SymbolTable();
	}

	public SymbolTable getSymtab() {
		return symtab;
	}


	/*@Override
	public void outAClassHdr(AClassHdr node) {
		String id = node.getId().getText();
		ClassEntry entry = new ClassEntry(id);
		if (symtab.insertBinding(entry)) {
			// success
			symtab.enterScope(entry);
		} else
		{
			//error message
			System.out.print("Unsuccessful command at line " + node.getId().getLine() + ": " + node);
		}
	}

	@Override
	public void outAEmptyClassDecl(AEmptyClassDecl node) {
		symtab.leaveScope();
	}

	@Override
	public void outAClassDecl(AClassDecl node) {
		symtab.leaveScope();
	}

	@Override
	public void outAVoidMethodHdr(AVoidMethodHdr node) {
		String id = node.getId().getText();
		MethodEntry entry = new MethodEntry(id, Type.voidValue);
		if (symtab.insertBinding(entry)) {
			//success
			symtab.enterScope(entry);
		} else
		{
			//error message
		}
	}

	@Override
	public void outATypeMethodHdr(ATypeMethodHdr node) {
		String id = node.getId().getText();
		Type t = (Type)getOut(node.getType());
		MethodEntry entry = new MethodEntry(id, t);
		if (symtab.insertBinding(entry)) {
			//success
			symtab.enterScope(entry);
		} else
		{
			//error message
		}
	}
	
	@Override
	public void outAMethod(AMethod node) { symtab.leaveScope(); }

	@Override
	public void outAEmptyMethod(AEmptyMethod node) { symtab.leaveScope(); }

	
	@Override
	public void outAField(AField node) {
		String id = node.getId().getText();
		Type t = (Type)getOut(node.getType());
		VariableEntry entry = new VariableEntry(id, t);
		
		if (symtab.insertBinding(entry)){
			//success
		} else
		{
			//error message
		}
	}
	
	@Override
	public void outAInitField(AInitField node) {
		String id = node.getId().getText();
		Type t = (Type)getOut(node.getType());
		VariableEntry entry = new VariableEntry(id, t);
		
		if (symtab.insertBinding(entry)){
			//success
		} else
		{
			//error message
		}
	}

	@Override
	public void outAArrayField(AArrayField node) {
		String id = node.getId().getText();
		int arraySize = Integer.parseInt(node.getIntLit().getText());
		Type t = (Type)getOut(node.getType());
		VariableEntry entry = new VariableEntry(id, t.makeArrayType(arraySize));
		
		if (symtab.insertBinding(entry)){
			//success
		} else
		{
			//error message
		}
	}
	
	@Override
	public void outAFormal(AFormal node) {
		String id = node.getId().getText();
		Type t = (Type)getOut(node.getType());
		VariableEntry entry = new VariableEntry(id, t);
		
		if (symtab.insertBinding(entry)){
			//success
		} else
		{
			//error message
		}
	}

	@Override
	public void outAArrayFormal(AArrayFormal node) {
		String id = node.getId().getText();
		Type t = (Type)getOut(node.getType());
		VariableEntry entry = new VariableEntry(id, t.makeArrayType(0));
		
		if (symtab.insertBinding(entry)){
			//success
		} else
		{
			//error message
		}
	}

	
	@Override
	public void outAIntType(AIntType node) { setOut(node, Type.intVar); 	}
	
	@Override
	public void outACharType(ACharType node) { setOut(node, Type.charVar); }

	@Override
	public void outABoolType(ABoolType node) { setOut(node, Type.boolVar); }

	@Override
	public void outAStringType(AStringType node) { setOut(node, Type.stringVar); 	}

	@Override
	public void outAFloatType(AFloatType node) { setOut(node, Type.floatVar); }*/

	
}
