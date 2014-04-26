package playerConnectionUI.actions;

import connectionsModel.Connection;
import connectionsModel.ConnectionModel;
import playerConnectionUI.Refreshable;
import status.checker.AvailableServer;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created with IntelliJ IDEA.
 * User: mcgui230
 * Date: 4/26/14
 * Time: 2:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConnectToPlayerAction extends AbstractAction{

    private AvailableServer availableServer;
    private ConnectionModel connectionModel;
    private Refreshable refreshable;

    public ConnectToPlayerAction(AvailableServer availableServer, ConnectionModel connectionModel, Refreshable refreshable) {
        super("Connect");
        this.availableServer = availableServer;
        this.connectionModel = connectionModel;
        this.refreshable = refreshable;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        connectionModel.addConnection(new Connection(availableServer));
        refreshable.refresh();
    }



}
